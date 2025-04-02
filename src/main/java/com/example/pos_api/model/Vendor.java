package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "vendors")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shop_name;
    private String description;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "vendor")
    private List<Product> products;

}
