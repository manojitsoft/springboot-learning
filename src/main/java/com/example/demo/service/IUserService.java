package com.example.demo.service;

import com.example.demo.core.ServiceException;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;

public interface IUserService {

	LoginResponse login(LoginRequest request) throws ServiceException;
}
