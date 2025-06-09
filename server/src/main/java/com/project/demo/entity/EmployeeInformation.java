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
 * 员工信息：(EmployeeInformation)表实体类
 *
 */
@TableName("`employee_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeInformation implements Serializable {

    // EmployeeInformation编号
    @TableId(value = "employee_information_id", type = IdType.AUTO)
    private Integer employee_information_id;

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
    // 基本工资
    @TableField(value = "`base_pay`")
    private Integer base_pay;
    // 员工档案
    @TableField(value = "`employee_profile`")
    private String employee_profile;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
