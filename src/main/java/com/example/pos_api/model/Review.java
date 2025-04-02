package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rating;
    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;


}
