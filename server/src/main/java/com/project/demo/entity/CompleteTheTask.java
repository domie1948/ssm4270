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
 * 完成任务：(CompleteTheTask)表实体类
 *
 */
@TableName("`complete_the_task`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CompleteTheTask implements Serializable {

    // CompleteTheTask编号
    @TableId(value = "complete_the_task_id", type = IdType.AUTO)
    private Integer complete_the_task_id;

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
    // 完成任务
    @TableField(value = "`complete_the_task`")
    private String complete_the_task;
    // 完成描述
    @TableField(value = "`completion_description`")
    private String completion_description;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
