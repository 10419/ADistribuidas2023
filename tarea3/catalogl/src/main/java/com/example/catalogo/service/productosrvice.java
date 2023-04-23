package com.example.catalogo.service;

import com.example.catalogo.entity.producto;
import java.util.List;
import java.util.Optional;

public interface productosrvice {
    public List<producto> list();

    public producto save(producto producto);

    public producto update(producto producto);

    public Optional<producto> listById(Integer id);

    public void deleteById(Integer id);
}