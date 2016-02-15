/*package com.springmvclearn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.springmvclearn.model.User;
import com.springmvclearn.service.UserManager;

@Component
public class HibernateTemplateTest {

	private UserManager um;
	

	public void setUm(UserManager um) {
		this.um = um;
	}
	
	public void testAdduser(User user) {
		um.saveUser(user);
	}

	public void testAdduser(String username,String password) {
		System.out.println("Test add user executed, now pay attention on if um's successfully injected");
		um.saveUser(username,password);
	}

}
*/