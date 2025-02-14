package com.API.PDV.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
    @Column(length = 100)
    private String description;
    @Column(length = 10,precision = 10,scale = 2,nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    int quantity;

}



