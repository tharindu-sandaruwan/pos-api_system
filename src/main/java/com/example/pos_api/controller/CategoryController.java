package com.example.pos_api.controller;

import com.example.pos_api.controller.requestDTO.CategoryRequestDTO;
import com.example.pos_api.controller.responseDTO.CategoryResponseDTO;
import com.example.pos_api.model.Category;
import com.example.pos_api.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @PostMapping(value = "/categories")
    public void create(@RequestBody CategoryRequestDTO categoryRequestDTO) {
        categoryService.create(categoryRequestDTO);
    }

    @GetMapping(value = "/categories")
    public List<CategoryResponseDTO> getAll() {

        List<CategoryResponseDTO> categoryResponseDTOS = new ArrayList<>();
        List<Category> categoryList = categoryService.findAll();
        for (Category category : categoryList) {
            CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
            categoryResponseDTO.setName(category.getName());
            categoryResponseDTOS.add(categoryResponseDTO);
        }
        return categoryResponseDTOS;
    }

}
