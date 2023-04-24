package com.example.ventas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.venta;
import com.example.ventas.repository.ventasrepository;
import com.example.ventas.service.ventasservice;

@Service
public class ventasserviceimpl implements ventasservice{
    @Autowired
    private ventasrepository cr;

    @Override
    public List<venta> list() {
        return cr.findAll();
    }

    @Override
    public venta save(venta cliente) {
        return cr.save(cliente);
    }

    @Override
    public venta update(venta categoria) {
        return cr.save(categoria);
    }

    @Override
    public Optional<venta> listById(Integer id) {
        return cr.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        cr.deleteById(id);
    }
}
