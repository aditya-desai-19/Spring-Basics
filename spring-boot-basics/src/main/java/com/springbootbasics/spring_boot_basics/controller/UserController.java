package com.springbootbasics.spring_boot_basics.controller;

import com.springbootbasics.spring_boot_basics.entity.Users;
import com.springbootbasics.spring_boot_basics.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UsersService usersService;

    @GetMapping("/")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }
}
