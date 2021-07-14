package com.test.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author wwg
 * @version jdk1.8
 * @Description TODO
 * @date 2021/7/14 10:44
 */
@Entity(name = "shop_user")
@Data
public class User {

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 数据库自增
    private Integer uid;

    /* 用户名 */
    private String userName;

    /* 密码 */
    private String password;

    /* 手机号 */
    private String telephone;
}
