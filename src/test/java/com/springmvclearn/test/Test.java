/*package com.springmvclearn.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springmvclearn.controller.UserController;
import com.springmvclearn.dao.UserDao;
import com.springmvclearn.model.User;
import com.springmvclearn.service.UserManager;

public class Test {

	public void  testbeans() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(ctx.getBeanDefinitionCount());
		System.out.println(ctx.getDisplayName());
		System.out.println(ctx.getBeanDefinitionNames());
		HibernateTemplate hi = (HibernateTemplate) ctx.getBean("hibernateTemplate");
		UserManager um = (UserManager) ctx.getBean("userManager");
		UserDao userdao = (UserDao) ctx.getBean("userDao");
		UserController ud = (UserController)ctx.getBean("userController");
		SessionFactory sf = (SessionFactory)ctx.getBean("sessionFactory");
		User u = new User();
		u.setPassword("ss1");
		u.setUserName("ss1");
		//userdao.saveUser(u);
		//hi.save(u);
		for(String str:ctx.getBeanDefinitionNames()){
			System.out.print(str+ "   ");
			System.out.println(ctx.containsBean(str));
		}
		HibernateTemplateTest ht = new HibernateTemplateTest();
		ht.testAdduser("new","new");

	}

}
*/