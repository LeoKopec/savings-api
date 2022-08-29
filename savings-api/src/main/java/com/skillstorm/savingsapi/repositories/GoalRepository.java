package com.skillstorm.savingsapi.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.skillstorm.savingsapi.models.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer>{

	@Query("select g from Goal g where g.user.username = ?1")
	List<Goal> findByUsername(String username);
}
