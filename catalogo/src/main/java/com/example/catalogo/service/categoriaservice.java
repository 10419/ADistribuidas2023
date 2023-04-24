package com.example.catalogo.service;

import com.example.catalogo.entity.categoria;
import java.util.List;
import java.util.Optional;


public interface categoriaservice {
    public List<categoria> list();

    public categoria save(categoria categoria);

    public categoria update(categoria categoria);

    public Optional<categoria> listById(Integer id);

    public void deleteById(Integer id);
}