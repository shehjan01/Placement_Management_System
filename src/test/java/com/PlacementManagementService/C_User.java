package com.PlacementManagementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementEntity.User;
import com.PlacementManagementRepository.UserRepository;

@Service
public class C_User implements UserService {
	@Autowired
	UserRepository repo;
	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	public User updateUser(long id, User user) {
		if(repo.findById(id).isPresent()) {
			repo.save(user);
		}
		System.out.println("User Updated Sucessfully");
		return user;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public boolean deleteUser(Long id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			System.out.println("User Deleted Sucessfully");
			return true;
		}
		System.out.println("User Not Found");
		return false;
	}

	@Override
	public User updateUser(Long id, User u) {
		if(repo.findById(id).isPresent()) {
			repo.save(u);
			System.out.println("User Updated Sucessfully");
		}
		return u;
	}

	@Override
	public User getUserById(Long id) {
		if(repo.findById(id).isPresent()) {
			repo.findById(id);
		}
		return null;
	}

}
