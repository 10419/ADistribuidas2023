package com.example.catalogo.entity;

import jakarta.persistence.Entity;

import java.util.Locale.Category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String ProductName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoria_id")
    @JsonIgnoreProperties({"hibernateLazyInitializar", "handler"})
    private categoria category;
}