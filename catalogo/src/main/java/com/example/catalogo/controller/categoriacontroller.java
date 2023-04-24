package com.example.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.catalogo.entity.categoria;
import com.example.catalogo.service.categoriaservice;

public class categoriacontroller {
    @Autowired
    private categoriaservice ps;

    @GetMapping()
    public java.util.List<categoria> listar() {
        return ps.list();
    }

    @PostMapping()
    public categoria guarda(@RequestBody categoria categoria) {
        return ps.save(categoria);
    }

    @GetMapping("{id}")
    public categoria buscarPorID(@PathVariable(required = true) Integer id) {
        return ps.listById(id).get();
    }

    @PutMapping()
    public categoria actu(@RequestBody categoria categoria) {
        return ps.update(categoria);
    }

    @DeleteMapping("{id}")
    public String eliminarporid(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
        return "eliminaciuon correcta";
    }
}
