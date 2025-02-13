package com.PlacementManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementEntity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(long id);
}
