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
 * 小组公告：(GroupAnnouncement)表实体类
 *
 */
@TableName("`group_announcement`")
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupAnnouncement implements Serializable {

    // GroupAnnouncement编号
    @TableId(value = "group_announcement_id", type = IdType.AUTO)
    private Integer group_announcement_id;

    // 组长（小）
    @TableField(value = "`team_leader_small`")
    private Integer team_leader_small;
    // 组长（大）
    @TableField(value = "`team_leader_chief`")
    private Integer team_leader_chief;
    // 组员1
    @TableField(value = "`team_member_1`")
    private Integer team_member_1;
    // 组员2
    @TableField(value = "`team_member_2`")
    private Integer team_member_2;
    // 组员3
    @TableField(value = "`group_member_3`")
    private Integer group_member_3;
    // 部门
    @TableField(value = "`department`")
    private String department;
    // 公告名称
    @TableField(value = "`announcement_name`")
    private String announcement_name;
    // 公告日期
    @TableField(value = "`date_of_announcement`")
    private Timestamp date_of_announcement;
    // 公告附件
    @TableField(value = "`announcement_attachment`")
    private String announcement_attachment;
    // 公告内容
    @TableField(value = "`announcement_content`")
    private String announcement_content;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
