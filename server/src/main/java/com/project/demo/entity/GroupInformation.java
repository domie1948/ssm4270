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
 * 小组信息：(GroupInformation)表实体类
 *
 */
@TableName("`group_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupInformation implements Serializable {

    // GroupInformation编号
    @TableId(value = "group_information_id", type = IdType.AUTO)
    private Integer group_information_id;

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










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
