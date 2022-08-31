package com.skillstorm.savingsapi.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/username/{username}")
	@ResponseStatus(code = HttpStatus.OK)
	public User findByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}
	
	@GetMapping("/id/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<User> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public User create(@Valid @RequestBody User user) {
		return service.save(user);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public User update(@Valid @RequestBody User user, @PathVariable int id) {
		user.setUser_id(id);
		return service.update(user);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	}

}
