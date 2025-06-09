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
 * 组长（小）：(TeamLeaderSmall)表实体类
 *
 */
@TableName("`team_leader_small`")
@Data
@EqualsAndHashCode(callSuper = false)
public class TeamLeaderSmall implements Serializable {

    // TeamLeaderSmall编号
    @TableId(value = "team_leader_small_id", type = IdType.AUTO)
    private Integer team_leader_small_id;

    // 组长姓名
    @TableField(value = "`name_of_team_leader`")
    private String name_of_team_leader;
    // 性别
    @TableField(value = "`gender`")
    private String gender;
    // 出生年月
    @TableField(value = "`date_of_birth`")
    private String date_of_birth;
    // 地址
    @TableField(value = "`address`")
    private String address;







    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
