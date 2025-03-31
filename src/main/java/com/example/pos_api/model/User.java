package com.example.pos_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String firstName;
    private String LastName;
    private String email;
    private String phoneNumber;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy ="user" )
    private List <Order> orderList;

    @OneToMany(mappedBy = "user")
    private List <Review> reviewList;



}
