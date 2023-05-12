package com.example.catalogo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class producto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private Integer productoId;
   private String productoNombre;
public static void deleteById(Integer id) {
}
}



