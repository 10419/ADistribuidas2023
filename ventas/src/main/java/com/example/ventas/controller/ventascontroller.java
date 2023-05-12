package com.example.ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.venta;
import com.example.ventas.service.ventasservice;

@RestController
@RequestMapping( "/venta")
public class ventascontroller {
    @Autowired
    private ventasservice ps;

    @GetMapping()
    public java.util.List<venta> listar() {
        return ps.list();
    }

    @PostMapping()
    public venta guarda(@RequestBody venta cliente) {
        return ps.save(cliente);
    }

    @GetMapping("{id}")
    public venta buscarPorID(@PathVariable(required = true) Integer id) {
        return ps.listById(id).get();
    }

    @PutMapping()
    public venta actu(@RequestBody venta cliente) {
        return ps.update(cliente);
    }

    @DeleteMapping("{id}")
    public String eliminarporid(@PathVariable(required = true) Integer id) {
        ps.deleteById(id);
        return "eliminaciuon correcta";
    }
}
