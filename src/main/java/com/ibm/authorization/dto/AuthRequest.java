package com.ibm.authorization.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AuthRequest {
	@NotNull
    private String username;
    @NotNull
    private String password;
}
