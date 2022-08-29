package com.skillstorm.savingsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.savingsapi.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
