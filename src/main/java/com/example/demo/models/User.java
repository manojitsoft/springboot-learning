package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "user")
public class User extends BaseModel {
	
	@Column(nullable = false)
	private String firstName;
	
	private String lastName;

	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
}
