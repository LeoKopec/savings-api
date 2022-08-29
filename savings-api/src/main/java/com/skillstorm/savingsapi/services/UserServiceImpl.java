package com.skillstorm.savingsapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.skillstorm.savingsapi.models.User;
import com.skillstorm.savingsapi.repositories.UserRepository;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<User> findById(int id) {
		Optional<User> user = repository.findById(id);
		return user;
	}

	@Override
	public User findByUsername(String username) {
		User user = repository.findByUsername(username);
		return user;
	}

}
