package com.springmvclearn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springmvclearn.dao.UserDao;
import com.springmvclearn.model.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {


	private HibernateTemplate hibernateTemplate;
	@Resource(name="ht")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void saveUser(User user) {
		System.out.println("Now check whatever exists in the beans.xml in userdaoimpl.");
		hibernateTemplate.save(user);		
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
		User u = new User();
		u.setUserName(user);
		u.setPassword(password);
		hibernateTemplate.save(u);
	}


	@Override
	public boolean loginUser(User user) {
		List<User> ls = new ArrayList<User>();
		ls =(ArrayList<User>) hibernateTemplate.find("from User where username=" +"'"+user.getUserName()+"'" + " and password="+"'"+user.getPassword()+"'");
		if (ls.size()>0){
			return true;
		} else{
			return false;
		}
		
	}


}
