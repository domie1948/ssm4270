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
 * 续假确认：(RenewalConfirmation)表实体类
 *
 */
@TableName("`renewal_confirmation`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RenewalConfirmation implements Serializable {

    // RenewalConfirmation编号
    @TableId(value = "renewal_confirmation_id", type = IdType.AUTO)
    private Integer renewal_confirmation_id;

    // 请假编号
    @TableField(value = "`leave_no`")
    private String leave_no;
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
    // 请假名称
    @TableField(value = "`leave_name`")
    private String leave_name;
    // 续假天数
    @TableField(value = "`days_of_extended_leave`")
    private Integer days_of_extended_leave;
    // 续假原因
    @TableField(value = "`reason_for_renewal_of_leave`")
    private String reason_for_renewal_of_leave;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
