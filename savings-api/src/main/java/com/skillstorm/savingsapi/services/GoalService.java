package com.skillstorm.savingsapi.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.skillstorm.savingsapi.models.Goal;

@Transactional
@Service
public interface GoalService {

	Goal save(Goal goal);
	Goal update(Goal goal);
	void deleteById(int id);
	List<Goal> findByUsername(String username);
	Optional<Goal> findById(int id);
}
