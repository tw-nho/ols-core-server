package com.thoughtworks.nho.api;

import com.thoughtworks.nho.domain.User;
import com.thoughtworks.nho.dto.UserDTO;
import com.thoughtworks.nho.repository.UserRepository;
import com.thoughtworks.nho.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<UserDTO> listUsers() {
        return userService.listUsers();
    }
}
