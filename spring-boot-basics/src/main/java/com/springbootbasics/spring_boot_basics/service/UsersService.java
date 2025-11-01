package com.springbootbasics.spring_boot_basics.service;

import com.springbootbasics.spring_boot_basics.dto.UserDTO;
import com.springbootbasics.spring_boot_basics.entity.Users;
import com.springbootbasics.spring_boot_basics.exceptions.UserNotFoundException;
import com.springbootbasics.spring_boot_basics.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsersService {

    private UserRepository userRepository;

    public UsersService(UserRepository ur) {
        this.userRepository = ur;
    }

    public Page<Users> getAllUsers(Integer page, Integer pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return userRepository.findAll(pageable);
    }

    public Optional<Users> getUserByUserId(String userId) {
        return userRepository.findById(userId);
    }

    public ResponseEntity<Users> addUser(UserDTO userDTO) {
        Users newUser = new Users();
        newUser.setId(UUID.randomUUID().toString());
        newUser.setName(userDTO.name);
        newUser.setAddress(userDTO.address);
        userRepository.save(newUser);

        URI location = URI.create("/users/" + newUser.getId());
        return ResponseEntity.created(location).body(newUser);
    }

    public ResponseEntity<Users> updateUser(Users user) {
        userRepository.save(user);

        return ResponseEntity.ok().body(user);
    }

    public ResponseEntity<String> deleteUserByUserId(String userId) {
        if(!userRepository.existsById(userId)) {
            throw new UserNotFoundException("User not found");
        }

        userRepository.deleteById(userId);
        return ResponseEntity.ok().body("Successfully deleted the user");
    }
}
