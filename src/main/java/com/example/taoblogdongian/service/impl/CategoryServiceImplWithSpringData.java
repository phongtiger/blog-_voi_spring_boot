package com.example.taoblogdongian.service.impl;

import com.example.taoblogdongian.model.Category;
import com.example.taoblogdongian.repository.CategoryRepository;
import com.example.taoblogdongian.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImplWithSpringData implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAllRest() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).isPresent()?categoryRepository.findById(id).get():null;
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }
}



