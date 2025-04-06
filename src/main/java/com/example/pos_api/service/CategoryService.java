package com.example.pos_api.service;

import com.example.pos_api.controller.requestDTO.CategoryRequestDTO;
import com.example.pos_api.model.Category;

import java.util.List;

public interface CategoryService {

    void create (CategoryRequestDTO categoryRequestDTO);

    List<Category> findAll();

}
