package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double total_amount;
    private String status;

    @ManyToOne
    private User user;


}
