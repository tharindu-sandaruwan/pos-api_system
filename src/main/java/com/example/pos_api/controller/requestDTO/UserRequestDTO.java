package com.example.pos_api.controller.requestDTO;

import com.example.pos_api.model.UserRole;
import lombok.Data;

@Data
public class UserRequestDTO {

    private String userName;
    private String firstName;
    private String LastName;
    private String email;
    private String phoneNumber;
    private String password;
    private UserRole role;


}
