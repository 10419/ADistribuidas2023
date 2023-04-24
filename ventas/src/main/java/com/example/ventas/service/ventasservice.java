package com.example.ventas.service;
import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.venta;

public interface ventasservice {
    public List<venta> list();

    public venta save(venta venta);

    public venta update(venta venta);

    public Optional<venta> listById(Integer id);

    public void deleteById(Integer id);
}
