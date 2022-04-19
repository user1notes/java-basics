package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		
	@Autowired
	UserRepository repository;

	Integer save(User user) {
		repository.save(user);
		return user.getId();
		//System.out.println("Save method called");
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	public List<User> getUserByName(String name){
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be empty string");
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	public List<User> getUserByAge(int age) {
		// TODO Auto-generated method stub

		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative " + age);
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;
	}

}
