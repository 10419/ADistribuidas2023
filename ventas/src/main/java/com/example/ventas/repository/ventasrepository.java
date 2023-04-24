package com.example.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.venta;

public interface ventasrepository extends JpaRepository<venta, Integer>  {
    
}
