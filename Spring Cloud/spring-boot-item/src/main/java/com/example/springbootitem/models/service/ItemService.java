package com.example.springbootitem.models.service;

import com.example.springbootitem.models.entity.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
