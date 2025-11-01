package com.springbootbasics.spring_boot_basics.controller;

import com.springbootbasics.spring_boot_basics.dto.UserDTO;
import com.springbootbasics.spring_boot_basics.entity.Users;
import com.springbootbasics.spring_boot_basics.exceptions.UserNotFoundException;
import com.springbootbasics.spring_boot_basics.service.UsersService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public Page<Users> getAllUsers(
            @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer pageSize
    ) {
        return usersService.getAllUsers(page, pageSize);
    }

    @GetMapping("/{userId}")
    public Users getUserById(@NotBlank @PathVariable String userId) {
        return usersService.getUserByUserId(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @PostMapping
    public ResponseEntity<Users> addUser(@Valid  @RequestBody UserDTO userDTO) {
        return usersService.addUser(userDTO);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Users> updateUser(@NotBlank @RequestBody Users user) {
        return usersService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@NotBlank @PathVariable String userId) {
        return usersService.deleteUserByUserId(userId);
    }
}
