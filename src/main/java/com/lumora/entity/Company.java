package com.lumora.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "legal_name", nullable = false, length = 150)
    private String legalName;

    @Column(name = "tax_id", nullable = false, unique = true, length = 30)
    private String taxId;

    @Column(length = 100)
    private String industry;

    @Column(length = 100)
    private String country;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "company")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    private List<Store> stores = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    private List<Supplier> suppliers = new ArrayList<>();
}