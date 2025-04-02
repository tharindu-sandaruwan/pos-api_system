package com.example.pos_api.controller.requestDTO;

import lombok.Data;

@Data
public class ProductRequestDTO {

    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String stock;
    private String category;

}
