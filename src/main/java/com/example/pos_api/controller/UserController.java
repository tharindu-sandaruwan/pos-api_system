package com.example.pos_api.controller;

import com.example.pos_api.controller.requestDTO.UserRequestDTO;
import com.example.pos_api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping(value = "/users")
    public void create(@RequestBody UserRequestDTO userRequestDTO) {
        userService.createUser(userRequestDTO);
    }
}
