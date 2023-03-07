package com.smart;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull()
    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;

    // all arguments contructor 
    // standard getters and setters
    
}
