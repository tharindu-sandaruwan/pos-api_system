package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "shopping_carts")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;


    @ManyToOne
    private Product product;


}
