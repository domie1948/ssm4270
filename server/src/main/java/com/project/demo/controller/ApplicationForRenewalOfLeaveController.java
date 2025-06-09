package com.project.demo.controller;

import com.project.demo.entity.ApplicationForRenewalOfLeave;
import com.project.demo.service.ApplicationForRenewalOfLeaveService;
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
 * 续假申请：(ApplicationForRenewalOfLeave)表控制层
 *
 */
@RestController
@RequestMapping("/application_for_renewal_of_leave")
public class ApplicationForRenewalOfLeaveController extends BaseController<ApplicationForRenewalOfLeave, ApplicationForRenewalOfLeaveService> {

    /**
     * 续假申请对象
     */
    @Autowired
    public ApplicationForRenewalOfLeaveController(ApplicationForRenewalOfLeaveService service) {
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
        return success(1);
    }

}
