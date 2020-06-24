package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

@Repository
public interface IUserRepository extends CrudRepository<User, String> {
	
	User findByEmail(String email);
}
