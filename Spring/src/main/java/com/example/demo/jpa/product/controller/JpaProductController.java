package com.example.demo.jpa.product.controller;

import com.example.demo.jpa.product.controller.form.RequestProductForm;
import com.example.demo.jpa.product.entity.JpaProduct;
import com.example.demo.jpa.product.service.JpaProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/register")
    public JpaProduct registerProduct (@RequestBody RequestProductForm requestProductForm) {
        log.info("registerProduct()");

        return productService.register(requestProductForm.toJpaProduct());
    }

    @GetMapping("/{productId}")
    public JpaProduct readBoard (@PathVariable("productId") Long productId) {
        log.info("productRead()");

        return productService.read(productId);
    }

    @DeleteMapping("/{productId}")
    public void delete (@PathVariable("productId") Long productId) {
        log.info("delete " + productId);
        productService.delete(productId);
    }

    @PutMapping("/{productId}")
    public JpaProduct modifyProduct (@PathVariable("productId") Long productId,
                                 @RequestBody RequestProductForm requestProductForm) {
        log.info("modifyProduct(): " + requestProductForm + ", id: " + productId);

        return productService.modify(productId, requestProductForm);
    }
}