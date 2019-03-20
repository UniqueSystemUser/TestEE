package com.uniquesystem.hrms.service;

import java.util.Optional;

import com.uniquesystem.hrms.model.User;

public interface UserService {
	public Optional<User> finduserBystrEmail(String email);
	
	public Optional<User> finduserBystrRestToken(String token);

	void save(User user);
	public User findByuserName(String userName);
}
