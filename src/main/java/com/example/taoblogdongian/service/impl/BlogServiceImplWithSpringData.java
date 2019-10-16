package com.example.taoblogdongian.service.impl;

import com.example.taoblogdongian.model.Blog;
import com.example.taoblogdongian.model.Category;
import com.example.taoblogdongian.repository.BlogRepository;
import com.example.taoblogdongian.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class BlogServiceImplWithSpringData implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return blogRepository.findAllByCategory(category);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).isPresent()?blogRepository.findById(id).get():null;
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByTittleContaining(String tittle, Pageable pageable) {
        return blogRepository.findAllByTittleContaining(tittle, pageable);
    }

    @Override
    public Page<Blog> findAllByCategory_Id(Long id, Pageable pageable) {
        return blogRepository.findAllByCategory_Id(id,pageable);
    }

}
