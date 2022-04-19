package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	Integer saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		//users.add(user);
		return service.save(user);
	}

	@GetMapping
	List<User> getUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/name/{name}")
	List<User> getUsers(@PathVariable String name) {

		System.out.println(name);
		return service.getUserByName(name);
	}

	@GetMapping("/age/{age}")
	List<User> getUsersByAge(@PathVariable int age) {

		return service.getUserByAge(age);
	}

}
