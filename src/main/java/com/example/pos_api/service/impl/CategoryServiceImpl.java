package com.example.pos_api.service.impl;

import com.example.pos_api.controller.requestDTO.CategoryRequestDTO;
import com.example.pos_api.model.Category;
import com.example.pos_api.repository.CategoryRepository;
import com.example.pos_api.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public void create(CategoryRequestDTO categoryRequestDTO) {
        Category category = new Category();
        category.setName(categoryRequestDTO.getName());
        categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryList;
    }
}
