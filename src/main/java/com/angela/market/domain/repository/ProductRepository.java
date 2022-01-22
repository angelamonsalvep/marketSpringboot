package com.angela.market.domain.repository;

import com.angela.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategoryId (int categoryId);
    Optional<List<Product>> getScarseProducts (int quantity);
    Optional<Product> getProduct (int productId);
    Product save (Product product);
    void delete (int productId);

}
