package com.skillstorm.savingsapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.savingsapi.models.User;
import com.skillstorm.savingsapi.services.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/{username}")
	@ResponseStatus(code = HttpStatus.OK)
	public User findByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}

}
