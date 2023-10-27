package com.example.springbootproductos.controlers;

import com.example.springbootproductos.models.dao.ProductoDao;
import com.example.springbootproductos.models.entity.Producto;
import com.example.springbootproductos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @GetMapping("/get")
    public List<Producto> listar() {
        return productoService.findAll();
    }

    @GetMapping("/get/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productoService.findById(id);
    }
}
