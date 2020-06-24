package com.example.demo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginResponse {

	private String token;
	
	private String expirationTimeInMillis;
}
