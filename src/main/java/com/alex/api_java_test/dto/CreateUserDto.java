package com.alex.api_java_test.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {
    @NotBlank(message = "name is required")
    private String name;

    @Email(message = "must be a valid email")
    @NotBlank(message = "email is required")
    private String email;
}
