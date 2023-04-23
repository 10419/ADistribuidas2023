package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.catalogo.entity.cliente;

public interface clienterepository extends JpaRepository<cliente, Integer>{
    
}
