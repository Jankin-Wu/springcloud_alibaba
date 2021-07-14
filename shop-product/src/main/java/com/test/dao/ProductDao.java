package com.test.dao;


import com.test.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wwg
 * @version jdk1.8
 * @Description TODO
 * @date 2021/7/14 10:35
 */
public interface ProductDao extends JpaRepository<Product, Integer> {

}
