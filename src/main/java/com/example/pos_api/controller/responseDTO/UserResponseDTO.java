package com.example.pos_api.controller.responseDTO;

import com.example.pos_api.model.UserRole;
import lombok.Data;

@Data
public class UserResponseDTO {

    private String userName;
    private String firstName;
    private String LastName;
    private String email;
    private String phoneNumber;
    private String password;
    private UserRole role;

}
