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
 * @date 2021/7/14 11:38
 */
//订单
@Entity(name = "shop_order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;//订单id
    private Integer uid;//用户id
    private String username;//用户名2.4 创建用户微服务
    private Integer pid;//商品id
    private String pname;//商品名称
    private Double pprice;//商品单价
    private Integer number;//购买数量
}
