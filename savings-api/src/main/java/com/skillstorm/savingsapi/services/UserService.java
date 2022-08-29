package com.skillstorm.savingsapi.services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.skillstorm.savingsapi.models.User;

@Transactional
@Service
public interface UserService {

	User save(User user);
	User update(User user);
	void deleteById(int id);
	Optional<User> findById(int id);
	User findByUsername(String username);
}
