package com.project.demo.controller;

import com.project.demo.entity.RenewalConfirmation;
import com.project.demo.service.RenewalConfirmationService;
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
 * 续假确认：(RenewalConfirmation)表控制层
 *
 */
@RestController
@RequestMapping("/renewal_confirmation")
public class RenewalConfirmationController extends BaseController<RenewalConfirmation, RenewalConfirmationService> {

    /**
     * 续假确认对象
     */
    @Autowired
    public RenewalConfirmationController(RenewalConfirmationService service) {
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
        String sql = "SELECT MAX(renewal_confirmation_id) AS max FROM "+"renewal_confirmation";
        Integer max = service.selectBaseCount(sql);
        sql = "UPDATE `leave_information` INNER JOIN `renewal_confirmation` ON leave_information.leave_no=renewal_confirmation.leave_no SET leave_information.leave_days= leave_information.leave_days + renewal_confirmation.days_of_extended_leave WHERE renewal_confirmation.renewal_confirmation_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}
