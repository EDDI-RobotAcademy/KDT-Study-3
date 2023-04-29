package com.example.demo.jpa.product.controller;

import com.example.demo.jpa.product.entity.JpaProduct;
import com.example.demo.jpa.product.service.JpaProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/jpa-product")
public class JpaProductController {

    final private JpaProductService productService;

    @GetMapping("/list")
    public List<JpaProduct> productList () {
        log.info("productList()");

        return productService.list();
    }

    @GetMapping("/{productId}")
    public JpaProduct readBoard (@PathVariable("productId") Long productId) {
        log.info("productRead()");

        return productService.read(productId);
    }
}