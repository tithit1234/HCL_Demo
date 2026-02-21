package com.example.inventory.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String subcategory;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
    private String specification;
    private Double price;
    private Integer stock;
    private String model;
    private String seller;
    private String location;

    // getters, setters, constructors
}
