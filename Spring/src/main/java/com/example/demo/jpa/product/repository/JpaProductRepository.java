package com.example.demo.jpa.product.repository;

import com.example.demo.jpa.product.entity.JpaProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<JpaProduct, Long>{
}
