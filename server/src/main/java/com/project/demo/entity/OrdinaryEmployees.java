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
 * 普通员工：(OrdinaryEmployees)表实体类
 *
 */
@TableName("`ordinary_employees`")
@Data
@EqualsAndHashCode(callSuper = false)
public class OrdinaryEmployees implements Serializable {

    // OrdinaryEmployees编号
    @TableId(value = "ordinary_employees_id", type = IdType.AUTO)
    private Integer ordinary_employees_id;

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
    // 员工性别
    @TableField(value = "`employee_gender`")
    private String employee_gender;
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
