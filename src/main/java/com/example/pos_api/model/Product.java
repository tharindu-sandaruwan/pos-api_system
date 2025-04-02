package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.xml.stream.events.Comment;
import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String stock;
    private String category;

    @ManyToOne
    private Vendor vendor;

    @OneToMany(mappedBy = "product")
    private List<Review> reviewList;

    @OneToMany(mappedBy = "product")
    private List<ShoppingCart> shoppingCartList;

}
