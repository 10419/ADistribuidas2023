package com.example.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cliente.entity.cliente;
import com.example.cliente.service.clienteservice;

@RestController
@RequestMapping( "/cliente")
public class clientecontroller {
    @Autowired
    private clienteservice ps;

    @GetMapping()
    public java.util.List<cliente> listar() {
        return ps.list();
    }

    @PostMapping()
    public cliente guarda(@RequestBody cliente cliente) {
        return ps.save(cliente);
    }

    @GetMapping("{id}")
    public cliente buscarPorID(@PathVariable(required = true) Integer id) {
        return ps.listById(id).get();
    }

    @PutMapping()
    public cliente actu(@RequestBody cliente cliente) {
        return ps.update(cliente);
    }

    @DeleteMapping("{id}")
    public String eliminarporid(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
        return "eliminaciuon correcta";
    }
}
