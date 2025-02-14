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
    private int quantity;

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String description, BigDecimal price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }
}



