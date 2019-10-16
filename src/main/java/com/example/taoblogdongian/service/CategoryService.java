package com.example.taoblogdongian.service;

import com.example.taoblogdongian.model.Category;

import java.util.List;

public interface CategoryService {
    Iterable<Category> findAll();
    List<Category> findAllRest();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
