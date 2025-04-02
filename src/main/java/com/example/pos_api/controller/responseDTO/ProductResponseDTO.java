package com.example.pos_api.controller.responseDTO;

import lombok.Data;

@Data
public class ProductResponseDTO {

    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String stock;
    private String category;

}
