package com.example.taoblogdongian.service;

import com.example.taoblogdongian.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
