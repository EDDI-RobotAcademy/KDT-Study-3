package com.example.demo.jpa.product.service;

import com.example.demo.jpa.product.controller.form.RequestProductForm;
import com.example.demo.jpa.product.entity.JpaProduct;
import java.util.List;

public interface JpaProductService {
    List<JpaProduct> list();

    JpaProduct read(Long productId);
    JpaProduct register(JpaProduct jpaProduct);
    void delete(Long productId);

    JpaProduct modify(Long productId, RequestProductForm requestProductForm);
}

