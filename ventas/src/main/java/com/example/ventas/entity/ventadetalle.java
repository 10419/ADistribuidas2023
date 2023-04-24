package com.example.ventas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ventadetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Double cantidad;
    private Double precio;
    private Integer producto_id;

    public ventadetalle() {
        this.cantidad=(double) 0;
        this.precio=(double) 0;
        
    }
}
