package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.security.core.context.SecurityContextHolder;

@MappedSuperclass
public abstract class BaseModel {
	
	@Id
	@GeneratedValue
	private String id;
	
	private Long createTime;
	
	private String createdBy = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
	private String updatedBy = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
	private Long updatedTime;

}
