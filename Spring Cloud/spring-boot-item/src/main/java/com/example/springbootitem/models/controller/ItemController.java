package com.example.springbootitem.models.controller;

import com.example.springbootitem.models.entity.Item;
import com.example.springbootitem.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/get")
    public List<Item> listar(){
        return itemService.findAll();
    }
    @GetMapping("/get/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad){
        return itemService.findById(id, cantidad);
    }
}
