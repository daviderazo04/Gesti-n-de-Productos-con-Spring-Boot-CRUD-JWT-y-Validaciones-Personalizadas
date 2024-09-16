package com.david.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.david.springboot.app.springboot_crud.entities.Product;

public interface ProductSercice {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product> delete(Product product);
}
