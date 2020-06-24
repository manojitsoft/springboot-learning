package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.core.ServiceException;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;

@Service
public class IUserServiceImpl implements IUserService {

	@Override
	public LoginResponse login(LoginRequest request) throws ServiceException {
		return null;
	}
}
