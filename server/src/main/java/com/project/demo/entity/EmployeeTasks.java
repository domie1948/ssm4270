package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 员工任务：(EmployeeTasks)表实体类
 *
 */
@TableName("`employee_tasks`")
@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeTasks implements Serializable {

    // EmployeeTasks编号
    @TableId(value = "employee_tasks_id", type = IdType.AUTO)
    private Integer employee_tasks_id;

    // 任务编号
    @TableField(value = "`task_number`")
    private String task_number;
    // 普通员工
    @TableField(value = "`ordinary_employees`")
    private Integer ordinary_employees;
    // 员工工号
    @TableField(value = "`employee_id`")
    private String employee_id;
    // 员工姓名
    @TableField(value = "`employee_name`")
    private String employee_name;
    // 组长（小）
    @TableField(value = "`team_leader_small`")
    private Integer team_leader_small;
    // 组长（大）
    @TableField(value = "`team_leader_chief`")
    private Integer team_leader_chief;
    // 任务名称
    @TableField(value = "`task_name`")
    private String task_name;
    // 任务文件
    @TableField(value = "`task_file`")
    private String task_file;
    // 要求内容
    @TableField(value = "`requirements`")
    private String requirements;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
