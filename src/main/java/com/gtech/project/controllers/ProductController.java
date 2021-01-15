package com.gtech.project.controllers;

import com.gtech.project.models.Product;
import com.gtech.project.payload.request.LoginRequest;
import com.gtech.project.respository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    public ResponseEntity<?> getProduct(@RequestParam("productName") String productName) {

        log.info("Process get product");

        Optional<Product> product = productRepository.findByProductName(productName);

        if (!product.isPresent()) {
            log.info("Product not found!");
            return ResponseEntity.badRequest().body("Product name not found!");
        }

        return ResponseEntity.ok(product);
    }

    @PostMapping("/product")
    public ResponseEntity<?> registerProduct(@Valid @RequestBody Product product) {

        log.info("Process save product");

        if (product.getId() != null) return ResponseEntity.badRequest().body("Id Already Exist!");
        productRepository.save(product);

        return ResponseEntity.ok(product);
    }
}
