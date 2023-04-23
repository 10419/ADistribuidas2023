package com.example.catalogo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogo.repository.clienterepository;
import com.example.catalogo.service.cliservice;
import com.example.catalogo.entity.cliente;
import java.util.List;
import java.util.Optional;

@Service
public class clienteserviceiml implements cliservice {
    @Autowired
    private clienterepository cr;

    @Override
    public List<cliente> list() {
        return cr.findAll();
    }

    @Override
    public cliente save(cliente cliente) {
        return cr.save(cliente);
    }

    @Override
    public cliente update(cliente cliente) {
        return cr.save(cliente);
    }

    @Override
    public Optional<cliente> listById(Integer id) {
        return cr.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        cr.deleteById(id);
    }
}
