package com.example.taoblogdongian.repository;

import com.example.taoblogdongian.model.Blog;
import com.example.taoblogdongian.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTittleContaining(String tittle, Pageable pageable);
    Page<Blog> findAllByCategory_Id(Long id, Pageable pageable);
}

