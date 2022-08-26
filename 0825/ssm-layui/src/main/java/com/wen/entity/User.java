package com.wen.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 17:29
 */
@Data
@Table(name = "tb_user")
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String password;
    private String salt;
}
