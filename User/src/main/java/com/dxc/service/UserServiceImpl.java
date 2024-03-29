package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User updateUser(User user, String userId) {
		// TODO Auto-generated method stub
		User user1= repo.getById(userId);
		user1.setUserName(user.getUserName());
		user1.setUserPassword(user.getUserPassword());
		user1.setUserMobile(user.getUserMobile());
		user1.setUserAddedDate(user.getUserAddedDate());
		return repo.save(user1);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUser(String userId) {
		repo.deleteById(userId);
	}

	@Override
	public User authenticateUser(String userId, String userPassword) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser= repo.findByUserIdAndUserPassword(userId,userPassword);
		return optionalUser.get();
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId).get();
	}

}
