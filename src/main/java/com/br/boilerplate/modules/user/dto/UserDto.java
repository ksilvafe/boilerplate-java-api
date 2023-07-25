package com.br.boilerplate.modules.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserDto {

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
