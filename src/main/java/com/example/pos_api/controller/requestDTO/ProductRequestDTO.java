package com.example.pos_api.controller.requestDTO;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductRequestDTO {

    private String name;
    private String description;
    private Double price;
    private MultipartFile imageUrl;
    private String stock;
    private String category;

}
