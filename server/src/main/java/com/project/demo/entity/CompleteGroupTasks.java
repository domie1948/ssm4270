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
 * 完成小组任务：(CompleteGroupTasks)表实体类
 *
 */
@TableName("`complete_group_tasks`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CompleteGroupTasks implements Serializable {

    // CompleteGroupTasks编号
    @TableId(value = "complete_group_tasks_id", type = IdType.AUTO)
    private Integer complete_group_tasks_id;

    // 任务编号
    @TableField(value = "`task_number`")
    private String task_number;
    // 任务名称
    @TableField(value = "`task_name`")
    private String task_name;
    // 发布日期
    @TableField(value = "`release_date`")
    private Timestamp release_date;
    // 组长（大）
    @TableField(value = "`team_leader_chief`")
    private Integer team_leader_chief;
    // 组长（小）
    @TableField(value = "`team_leader_small`")
    private Integer team_leader_small;
    // 完成任务
    @TableField(value = "`complete_the_task`")
    private String complete_the_task;
    // 描述内容
    @TableField(value = "`description`")
    private String description;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
