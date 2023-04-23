package com.example.catalogo.repository;

import com.example.catalogo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productorepository extends JpaRepository<producto, Integer> {
}
