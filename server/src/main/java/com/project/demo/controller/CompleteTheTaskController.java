package com.project.demo.controller;

import com.project.demo.entity.CompleteTheTask;
import com.project.demo.service.CompleteTheTaskService;
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
 * 完成任务：(CompleteTheTask)表控制层
 *
 */
@RestController
@RequestMapping("/complete_the_task")
public class CompleteTheTaskController extends BaseController<CompleteTheTask, CompleteTheTaskService> {

    /**
     * 完成任务对象
     */
    @Autowired
    public CompleteTheTaskController(CompleteTheTaskService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maptask_number = new HashMap<>();
        maptask_number.put("task_number",String.valueOf(paramMap.get("task_number")));
        List listtask_number = service.selectBaseList(service.select(maptask_number, new HashMap<>()));
        if (listtask_number.size()>0){
            return error(30000, "字段任务编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
