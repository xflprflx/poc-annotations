package com.xflprflx.poc_annotations.model;

import com.xflprflx.poc_annotations.validation.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record NewUserRequest(

        @NotBlank String username,

        @NotBlank @Email String email,

        @ValidPassword(minLength = 10)String password
) {}
