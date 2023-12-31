package com.example.springbootitem.models.service;

import com.example.springbootitem.models.entity.Item;
import com.example.springbootitem.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;
    @Override
    public List<Item> findAll() {
        List<Producto> productos = Arrays.asList(Objects.requireNonNull(clienteRest.getForObject("http://localhost:8001/get", Producto[].class)));
        return productos.stream().map(p -> new Item(p,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id.toString());
        Producto producto = clienteRest.getForObject("http://localhost:8001/get/{id}",Producto.class,pathVariables);
        return new Item(producto, cantidad);
    }
}
