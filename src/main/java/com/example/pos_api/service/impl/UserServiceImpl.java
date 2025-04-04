package com.example.pos_api.service.impl;

import com.example.pos_api.controller.requestDTO.UserRequestDTO;
import com.example.pos_api.model.User;
import com.example.pos_api.repository.UserRepository;
import com.example.pos_api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public void createUser(UserRequestDTO userRequestDTO) {
         User user = new User();
         user.setUserName(userRequestDTO.getUserName());
         user.setFirstName(userRequestDTO.getFirstName());
         user.setLastName(userRequestDTO.getLastName());
         user.setPassword(userRequestDTO.getPassword());
         user.setEmail(userRequestDTO.getEmail());
         user.setPhoneNumber(userRequestDTO.getPhoneNumber());
         user.setRole(userRequestDTO.getRole());
         userRepository.save(user);

    }

    @Override
    public void deleteById(Long userId) {
       userRepository.deleteById(userId);
    }
}
