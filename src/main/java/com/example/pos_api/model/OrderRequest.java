package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "order_requests")
public class OrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double total_amount;
    private String status;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "orderRequest")
    private List<OrderItem> orderItemList;


}
