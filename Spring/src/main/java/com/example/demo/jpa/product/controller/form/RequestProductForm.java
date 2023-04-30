package com.example.demo.jpa.product.controller.form;

import com.example.demo.jpa.product.entity.JpaProduct;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductForm {

    final private String productName;
    final private Integer productPrice;
    final private String vendor;
    @JsonFormat(pattern="yyyy-MM-dd")
    final private LocalDate manufactureDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    final private LocalDate expiredDate;
    final private String category;

    public JpaProduct toJpaProduct () {
        return new JpaProduct(productName, productPrice, vendor, manufactureDate, expiredDate, category);
    }
}
