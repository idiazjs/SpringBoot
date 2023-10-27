package com.example.springbootproductos.models.dao;

import com.example.springbootproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
    
}
