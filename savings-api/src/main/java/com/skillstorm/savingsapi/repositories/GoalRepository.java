package com.skillstorm.savingsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.savingsapi.models.Goal;

public interface GoalRepository extends JpaRepository<Goal, Integer>{

}
