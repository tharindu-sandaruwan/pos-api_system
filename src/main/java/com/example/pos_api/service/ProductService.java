package com.example.pos_api.service;

import com.example.pos_api.controller.requestDTO.OrderRequestDTO;
import com.example.pos_api.controller.requestDTO.ProductRequestDTO;
import com.example.pos_api.model.OrderRequest;
import com.example.pos_api.model.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    Product create(ProductRequestDTO productRequestDTO) throws IOException;

    List<Product> findAll();

    Product updateById(Long productId , ProductRequestDTO productRequestDTO);

    void deleteById(Long productId);

}
