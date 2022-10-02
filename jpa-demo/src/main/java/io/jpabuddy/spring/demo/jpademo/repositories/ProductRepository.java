package io.jpabuddy.spring.demo.jpademo.repositories;

import io.jpabuddy.spring.demo.jpademo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductName(String productName);



}