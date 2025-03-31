package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rating;
    private String comment;

    @ManyToOne
    private User user;


}
