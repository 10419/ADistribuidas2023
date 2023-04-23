package com.example.catalogo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ClientId;
    private String ClientName;
    private String ClientLastName;
    private Integer Clientage;
}
