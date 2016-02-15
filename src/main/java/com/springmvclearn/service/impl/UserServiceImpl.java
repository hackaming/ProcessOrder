package com.springmvclearn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvclearn.dao.UserDao;
import com.springmvclearn.model.User;
import com.springmvclearn.service.UserManager;

@Transactional
@Service("UserManager")
public class UserServiceImpl implements UserManager {

	@Resource
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void saveUser(User user) {
		System.out.println("now check if user dao's false:" + (null == userdao));
		userdao.saveUser(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUser(String user, String password) {
		userdao.saveUser(user, password);

	}

	@Override
	public boolean loginUser(User user) {
		return userdao.loginUser(user);
	}

}
