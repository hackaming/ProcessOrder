package com.springmvclearn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.springmvclearn.dao.impl.UserDaoImpl;
import com.springmvclearn.model.Orders;
import com.springmvclearn.model.Project;
import com.springmvclearn.model.User;
import com.springmvclearn.order.OrderProcessingGetFromMQAndSaveToDB;
import com.springmvclearn.order.OrderProduceAndSendToRabbitMQ;
import com.springmvclearn.order.OrderSerialize;
import com.springmvclearn.service.OrdersManager;
import com.springmvclearn.service.ProjectManager;
import com.springmvclearn.service.UserManager;
import com.springmvclearn.service.impl.UserServiceImpl;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class UserController  {
	private static Logger logger = Logger.getLogger(UserController.class);
	private final static String QUEUE_NAME = "hello";
	private UserManager um;
	private ProjectManager pm;
	private OrdersManager om;
	
	@Resource
	public void setOm(OrdersManager om) {
		this.om = om;
	}
	public OrdersManager getOm() {
		return om;
	}

	public UserManager getUm() {
		return um;
	}
	@Resource
	public void setUm(UserManager um) {
		this.um = um;
	}
	public ProjectManager getPm() {
		return pm;
	}
	@Resource
	public void setPm(ProjectManager pm) {
		this.pm = pm;
	}
	
	public UserController() throws Exception{
		logger.debug("Now the Controller's initialized, begin to call the getFromServer, it will wait for any request and save it into db.");
		getFromServer();
		
	}
	public void getFromServer() throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUri("amqp://test:password@10.184.186.243:5672/%2F");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
					byte[] body) throws IOException {
				String orderString = new String(body, "UTF-8");
				System.out.println(" [x] Received '" + orderString + "'");
				OrderSerialize os = new OrderSerialize();
				Orders order = os.StringToOrder(orderString);
				System.out.println("Now we get the order:" + order + "now save it into db");
				System.out.println("Now call test beans to check what benas we have in spring");;
				//testbeans();
				if (null == om) {
					System.out.println("The injected Ordersmanager is null, exception shows, the order has not been saved into DB ");
					return;
				} else {
					om.saveOrders(order);
				}
			}
		};
		channel.basicConsume(QUEUE_NAME, true, consumer);
	}
}
