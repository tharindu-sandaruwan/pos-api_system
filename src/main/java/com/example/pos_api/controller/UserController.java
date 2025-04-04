package com.example.pos_api.controller;

import com.example.pos_api.controller.requestDTO.UserRequestDTO;
import com.example.pos_api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping(value = "/users")
    public void create(@RequestBody UserRequestDTO userRequestDTO) {
        userService.createUser(userRequestDTO);
    }

    @DeleteMapping(value = "/users/{user-id}")
    public void delete(@PathVariable ("user-id") long userId, UserRequestDTO userRequestDTO) {
        userService.deleteById(userId);
    }
}
