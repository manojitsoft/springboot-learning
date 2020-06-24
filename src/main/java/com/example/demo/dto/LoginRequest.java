package com.example.demo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginRequest {

	private String userName;
	
	private String password;
}
