package com.springmvclearn.order;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.springmvclearn.model.Orders;

public class OrderProduceAndSendToRabbitMQ {
	private final static String QUEUE_NAME = "hello";

	public boolean sendToServer(Orders order) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();

		factory.setUri("amqp://test:password@10.184.186.243:5672/%2F");

		Connection connection = null;

		connection = factory.newConnection();

		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		OrderSerialize os = new OrderSerialize();
		String orderToString = os.OrderToStringConvert(order);

		channel.basicPublish("", QUEUE_NAME, null, orderToString.getBytes());

		System.out.println(" [x] Sent '" + orderToString + "'");

		channel.close();

		connection.close();

		return false;
	}
}
