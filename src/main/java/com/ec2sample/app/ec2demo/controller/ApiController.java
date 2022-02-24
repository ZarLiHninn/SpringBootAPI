package com.ec2sample.app.ec2demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec2sample.app.ec2demo.model.User;
import com.ec2sample.app.ec2demo.repository.UserRepository;

@RestController
public class ApiController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public String showText() {
		return "Hello World";
	}
	
	@GetMapping("/userlist")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
