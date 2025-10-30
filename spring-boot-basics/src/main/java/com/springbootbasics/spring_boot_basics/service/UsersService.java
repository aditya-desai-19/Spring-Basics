package com.springbootbasics.spring_boot_basics.service;

import com.springbootbasics.spring_boot_basics.entity.Users;
import com.springbootbasics.spring_boot_basics.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsersService {

    private UserRepository userRepository;

    public UsersService(UserRepository ur) {
        this.userRepository = ur;
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
//
//    public ResponseEntity addUser(Users user) {
//        user.setId(UUID.randomUUID().toString());
//        return ResponseEntity.ok();
//    }
}
