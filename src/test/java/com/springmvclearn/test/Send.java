package com.springmvclearn.test;
import com.rabbitmq.client.ConnectionFactory;
import com.springmvclearn.model.Project;
import com.springmvclearn.model.User;
import com.rabbitmq.client.Connection;

import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

public class Send {
	  private final static String QUEUE_NAME = "hello";

	  public static void main(String[] argv)  throws java.io.IOException {
		    ConnectionFactory factory = new ConnectionFactory();
		    try {
				factory.setUri("amqp://test:password@10.184.186.243:5672/%2F");
			} catch (KeyManagementException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NoSuchAlgorithmException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    Connection connection = null;
			try {
				connection = factory.newConnection();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Channel channel = connection.createChannel();
		    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		    Project p = new Project();
		    
		    String message = "Hello World!";
		    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		    
		    
		    System.out.println(" [x] Sent '" + message + "'");
		    try {
				channel.close();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    connection.close();
		    
		    
	}
}