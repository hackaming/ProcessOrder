package com.springmvclearn.order;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.springmvclearn.model.Orders;

public class OrderSerialize {
	private Logger logger = Logger.getLogger(OrderSerialize.class);
	public String OrderToStringConvert(Orders order){
	    SerializerFeature feature = SerializerFeature.DisableCircularReferenceDetect;  
	    String jsonStrng  = JSON.toJSONString(order);
	    logger.debug("The order has been convert to string:" + jsonStrng);
	    System.out.println("The order has been convert to string:" + jsonStrng);
	    logger.debug("Now begin to convert the string into object in the same method OrderToStringConvert");
	    Orders o = JSON.parseObject(jsonStrng ,Orders.class);
	    logger.debug("The converted object o is:" + o);
	    logger.debug(o.getId());
	    logger.debug(o.getProjectid());
	    logger.debug(o.getPurchaseamount());
		return jsonStrng;
	}
	public Orders StringToOrder(String orderString){
		System.out.println("In Orderserialize object, StringToOrder method, now convert the string into object. The string is:" + orderString);
		logger.debug("In Orderserialize object, StringToOrder method, now convert the string into object. The string is:" + orderString);
		Orders order = (Orders)JSON.parseObject(orderString ,Orders.class);
		logger.debug("The string has been converted to object:" + order);
		System.out.println("The string has been converted to object:" + order);
		return order;
	}
}
