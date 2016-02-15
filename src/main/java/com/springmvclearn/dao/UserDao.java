package com.springmvclearn.dao;

import java.util.List;

import com.springmvclearn.model.User;

public interface UserDao {
	public void saveUser(User user);
	public void deleteUser(User user);
	public List<User> findById(int id);
	public List<User> findAll();
	public void update(User user);
	public void saveUser(String user, String password);
	public boolean loginUser(User user);
}
