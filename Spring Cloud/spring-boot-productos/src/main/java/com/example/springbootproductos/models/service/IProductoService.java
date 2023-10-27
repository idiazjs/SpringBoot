package com.example.springbootproductos.models.service;

import com.example.springbootproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public Producto findById(Long id);
}
