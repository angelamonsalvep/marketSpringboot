package com.angela.market.web.controller;

import com.angela.market.domain.Product;
import com.angela.market.domain.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public List<Product> getAll() {
        return productService.getAll();
    }
    public Optional<Product> getProduct(int productId) {
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategoryId (int categoryId) {
        return productService.getByCategoryId(categoryId);
    }

    public Product save (Product product) {
        return productService.save(product);
    }

    public boolean delete (int productId) {
        return productService.delete(productId);
    }

}
