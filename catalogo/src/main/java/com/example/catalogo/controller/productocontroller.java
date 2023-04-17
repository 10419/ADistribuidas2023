package com.example.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogo.entity.producto;
import com.example.catalogo.service.productosrvice;

@RestController
@RequestMapping("/producto")
public class productocontroller {
    @Autowired
    private productosrvice ps;

    @GetMapping()
    public java.util.List<producto> listar() {
        return ps.list();
    }

    @PostMapping()
    public producto guarda(@RequestBody producto producto) {
        return ps.save(producto);
    }

    @GetMapping("{id}")
    public producto buscarPorID(@PathVariable(required = true) Integer id) {
        return ps.listById(id).get();
    }

    @PutMapping()
    public producto actu(@RequestBody producto producto) {
        return ps.update(producto);
    }

    @DeleteMapping("{id}")
    public void eliminarporid(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
    }

}