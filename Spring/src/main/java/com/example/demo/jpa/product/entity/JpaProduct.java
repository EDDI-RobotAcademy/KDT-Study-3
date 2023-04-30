package com.example.demo.jpa.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class JpaProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId; // 상품 아이디

    private String productName;     // 상품명
    @Setter
    private Integer productPrice;    // 상품 가격
    @Setter
    private String vendor;
    private LocalDate manufactureDate;
    @Setter
    private String category;        // 상품 카테고리

    public JpaProduct(String productName, Integer productPrice, String vendor, LocalDate manufactureDate, String category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.vendor = vendor;
        this.manufactureDate = manufactureDate;
        this.category = category;
    }

    @CreatedDate
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;
}
