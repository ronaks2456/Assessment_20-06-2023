package com.dxc.service;

import java.util.List;

import com.dxc.model.User;

public interface UserService {
	public User createUser(User user);
	public User updateUser(User user, String userId);
	public List<User> getAllUser();
	public User getUserById(String userId);
	public void deleteUser(String userId);
	public User authenticateUser(String userId, String userPassword);

}
