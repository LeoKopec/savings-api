package com.skillstorm.savingsapi.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.skillstorm.savingsapi.models.Goal;
import com.skillstorm.savingsapi.models.User;
import com.skillstorm.savingsapi.repositories.GoalRepository;

@Transactional
@Service
public class GoalServiceImpl implements GoalService{

	@Autowired
	private GoalRepository repository;
	
	@Override
	public Goal save(Goal goal) {
		return repository.save(goal);
	}

	@Override
	public Goal update(Goal goal) {
		return repository.save(goal);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Goal> findByUsername(User user) {
		String username = user.getUsername();
		List<Goal> goals = repository.findByUsername(username);
		return goals;
	}

	@Override
	public Optional<Goal> findById(int id) {
		Optional<Goal> goal = repository.findById(id);
		return goal;
	}
	
}
