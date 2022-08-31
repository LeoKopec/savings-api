package com.skillstorm.savingsapi.controllers;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
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
	
	@GetMapping("/username/{username}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Goal> findByUsername(@PathVariable String username) {
		return service.findByUsername(username);
	}
	
	@GetMapping("/id/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Goal> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Goal create(@Valid @RequestBody Goal goal) {
		return service.save(goal);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Goal update(@Valid @RequestBody Goal goal, @PathVariable int id) {
		goal.setId(id);
		return service.update(goal);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	}
}
