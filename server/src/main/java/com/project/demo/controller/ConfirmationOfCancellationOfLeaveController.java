package com.project.demo.controller;

import com.project.demo.entity.ConfirmationOfCancellationOfLeave;
import com.project.demo.service.ConfirmationOfCancellationOfLeaveService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 销假确认：(ConfirmationOfCancellationOfLeave)表控制层
 *
 */
@RestController
@RequestMapping("/confirmation_of_cancellation_of_leave")
public class ConfirmationOfCancellationOfLeaveController extends BaseController<ConfirmationOfCancellationOfLeave, ConfirmationOfCancellationOfLeaveService> {

    /**
     * 销假确认对象
     */
    @Autowired
    public ConfirmationOfCancellationOfLeaveController(ConfirmationOfCancellationOfLeaveService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapleave_no = new HashMap<>();
        mapleave_no.put("leave_no",String.valueOf(paramMap.get("leave_no")));
        List listleave_no = service.selectBaseList(service.select(mapleave_no, new HashMap<>()));
        if (listleave_no.size()>0){
            return error(30000, "字段请假编号内容不能重复");
        }
        this.addMap(paramMap);
        String sql = "SELECT MAX(confirmation_of_cancellation_of_leave_id) AS max FROM "+"confirmation_of_cancellation_of_leave";
        Integer max = service.selectBaseCount(sql);
        sql = ("SELECT count(*) count FROM `leave_information` INNER JOIN `confirmation_of_cancellation_of_leave` ON leave_information.leave_no=confirmation_of_cancellation_of_leave.leave_no WHERE leave_information.leave_days < confirmation_of_cancellation_of_leave.days_off_leave AND confirmation_of_cancellation_of_leave.confirmation_of_cancellation_of_leave_id="+max).replaceAll("&#60;","<");
        Integer count = service.selectBaseCount(sql);
        if(count>0){
            sql = "delete from "+"confirmation_of_cancellation_of_leave"+" WHERE "+"confirmation_of_cancellation_of_leave_id"+" ="+max;
            service.deleteBaseSql(sql);
            return error(30000,"当前请假天数不足！");
        }
        sql = "UPDATE `leave_information` INNER JOIN `confirmation_of_cancellation_of_leave` ON leave_information.leave_no=confirmation_of_cancellation_of_leave.leave_no SET leave_information.leave_days= leave_information.leave_days - confirmation_of_cancellation_of_leave.days_off_leave WHERE confirmation_of_cancellation_of_leave.confirmation_of_cancellation_of_leave_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}
