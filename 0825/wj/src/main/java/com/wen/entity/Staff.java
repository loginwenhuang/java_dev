package com.wen.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 9:01
 */
@Data
public class Staff {
    @Id
    private Integer sId;
    private String sName;
    private String sex;
    private Date birthday;
    private Integer d_id;
    @Transient
    private Department department;
}
