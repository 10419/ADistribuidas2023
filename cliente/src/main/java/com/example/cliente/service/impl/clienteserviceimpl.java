package com.example.cliente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cliente.entity.cliente;
import com.example.cliente.repository.clienterepository;
import com.example.cliente.service.clienteservice;

import java.util.List;
import java.util.Optional;

@Service
public class clienteserviceimpl implements clienteservice{
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
    public cliente update(cliente categoria) {
        return cr.save(categoria);
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