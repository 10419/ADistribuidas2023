package com.example.catalogo.service;

import com.example.catalogo.entity.cliente;
import java.util.List;
import java.util.Optional;

public interface cliservice {
    public List<cliente> list();

    public cliente save(cliente cliente);

    public cliente update(cliente cliente);

    public Optional<cliente> listById(Integer id);

    public void deleteById(Integer id);
}