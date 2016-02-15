package com.springmvclearn.test;

import com.springmvclearn.model.Orders;
import com.springmvclearn.order.OrderProduceAndSendToRabbitMQ;

public class OrderSendTest {
	public static void main(String[] argv) throws Exception{
		Orders orders = new Orders();		
		orders.setProjectid(1);
		orders.setUserid(1);
		orders.setPurchaseamount(5);
		OrderProduceAndSendToRabbitMQ optr = new OrderProduceAndSendToRabbitMQ();
		for (int i=0;i<100;i++){
		optr.sendToServer(orders);
		}
	}
}
