package com.example.demo.jpa.product.controller.form;

import com.example.demo.jpa.product.entity.JpaProduct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductForm {

    final private String productName;
    final private String productPrice;
    final private String vendor;
    final private String expiredDate;
    final private String manufactureDate;
    final private String category;

    public JpaProduct toJpaProduct () {
        return new JpaProduct(productName, productPrice, vendor, expiredDate, manufactureDate, category);
    }
}
