package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginRequest;
import com.example.demo.service.IUserService;

@RestController
@RequestMapping("/noauth")
public class AuthController {

	@Autowired
	IUserService userService;
	
	@PostMapping("/login")
	public void login(@RequestBody LoginRequest request) {
		
	}
}
