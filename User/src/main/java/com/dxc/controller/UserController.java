package com.dxc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.User;
import com.dxc.model.UserCredential;
import com.dxc.service.TokenGeneratorService;
import com.dxc.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	private TokenGeneratorService tokenGenerator;

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
	}

	@PutMapping("/update/userId-{userId}")
	public User updateUser(@RequestBody User user, @PathVariable String userId) {
		return service.updateUser(user, userId);
	}

	@GetMapping("/all-users")
	public List<User> allUsers() {
		return service.getAllUser();
	}

	@GetMapping("/userId-{userId}")
	public User getUserById(@PathVariable String userId) {
		return service.getUserById(userId);
	}

	@DeleteMapping("/delete/userId-{userId}")
	public void deleteUser(String userId) {
		service.deleteUser(userId);
	}
	
	 @PostMapping("login") public Map<String,String> authenticateUser(@RequestBody UserCredential uc) 
	 { 
		 User user = service.authenticateUser(uc.getUserId(), uc.getUserPassword());
		 return tokenGenerator.generateToken(user);
	 }
 
	
}