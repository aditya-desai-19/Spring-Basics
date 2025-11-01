package com.springbootbasics.spring_boot_basics.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    @NotBlank(message = "Name is required")
    public String name;

    public String address;
}
