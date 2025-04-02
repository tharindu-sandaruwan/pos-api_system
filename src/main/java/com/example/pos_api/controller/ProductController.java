package com.example.pos_api.controller;

import com.example.pos_api.controller.requestDTO.ProductRequestDTO;
import com.example.pos_api.controller.responseDTO.ProductResponseDTO;
import com.example.pos_api.model.Product;
import com.example.pos_api.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor

public class ProductController {

    private ProductService productService;

    @PostMapping(value = "/products")
    public void create(@RequestBody ProductRequestDTO productRequestDTO) {
        productService.create(productRequestDTO);
    }

    @GetMapping(value = "/products")
    public List<ProductResponseDTO> getAll() {

        List<ProductResponseDTO> productResponseDTOS = new ArrayList<>();
        List<Product> products = productService.findAll();
        for (Product product : products) {
            ProductResponseDTO productResponseDTO = new ProductResponseDTO();
            productResponseDTO.setName(product.getName());
            productResponseDTO.setPrice(product.getPrice());
            productResponseDTO.setImageUrl(product.getImageUrl());
            productResponseDTO.setStock(product.getStock());
            productResponseDTO.setCategory(product.getCategory());
            productResponseDTOS.add(productResponseDTO);
        }
        return productResponseDTOS;
    }

    @PutMapping(value = "/products/{product-id}")
    public void updateById(@PathVariable ("product-id") long productId,@RequestBody ProductRequestDTO productRequestDTO) {
        productService.updateById(productId,productRequestDTO);
    }

    @DeleteMapping(value = "/products/{product-id}")
    public void deleteById(@PathVariable("product-id") Long productId) {
        productService.deleteById(productId);
    }
}
