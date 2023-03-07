package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // custom query methods go here
}

