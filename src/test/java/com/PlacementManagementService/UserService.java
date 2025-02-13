package com.PlacementManagementService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PlacementEntity.User;

@Service
public interface UserService {
	public User addUser(User user);
	public User updateUser(long id,User user);
	public User login(User user);
	public boolean logOut();
	List<User> getAllUsers();
	public boolean deleteUser(Long id);
	public User updateUser(Long id, User u);
	public User getUserById(Long id);
}
