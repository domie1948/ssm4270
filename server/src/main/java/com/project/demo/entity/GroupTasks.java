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
 * 小组任务：(GroupTasks)表实体类
 *
 */
@TableName("`group_tasks`")
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupTasks implements Serializable {

    // GroupTasks编号
    @TableId(value = "group_tasks_id", type = IdType.AUTO)
    private Integer group_tasks_id;

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
    // 任务附件
    @TableField(value = "`task_attachment`")
    private String task_attachment;
    // 任务内容
    @TableField(value = "`task_content`")
    private String task_content;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
