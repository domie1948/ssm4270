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
 * 下班打卡：(ClockOut)表实体类
 *
 */
@TableName("`clock_out`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ClockOut implements Serializable {

    // ClockOut编号
    @TableId(value = "clock_out_id", type = IdType.AUTO)
    private Integer clock_out_id;

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
    // 打卡日期
    @TableField(value = "`clock_in_date`")
    private Timestamp clock_in_date;
    // 打卡次数
    @TableField(value = "`number_of_clocking_in`")
    private String number_of_clocking_in;



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




    // 当前位置
    @TableField(value = "location_address")
    private String location_address;
    // 当前位置经度
    @TableField(value = "location_lng")
    private String location_lng;
    // 当前位置纬度
    @TableField(value = "location_lat")
    private String location_lat;



}
