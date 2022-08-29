package com.skillstorm.savingsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.savingsapi.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
