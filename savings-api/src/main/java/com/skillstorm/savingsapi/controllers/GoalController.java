package com.skillstorm.savingsapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.skillstorm.savingsapi.models.Goal;
import com.skillstorm.savingsapi.services.GoalService;

@RestController
@CrossOrigin("*")
@RequestMapping("/goals")
public class GoalController {

	@Autowired
	private GoalService service;
	
	@GetMapping("/{username}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Goal> findByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}
	
	@GetMapping("/{username}/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Goal> findById(@PathVariable int id) {
		return service.findById(id);
	}
}
