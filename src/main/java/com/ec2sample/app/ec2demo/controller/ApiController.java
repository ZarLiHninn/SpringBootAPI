package com.ec2sample.app.ec2demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec2sample.app.ec2demo.model.User;
import com.ec2sample.app.ec2demo.service.UserService;

@RestController
public class ApiController {

	private final UserService userService;

	public ApiController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public String showText() {
		return "Hello World";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.findAllUsers();
	}
}
