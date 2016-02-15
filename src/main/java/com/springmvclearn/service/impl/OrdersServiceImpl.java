package com.springmvclearn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvclearn.dao.OrdersDao;
import com.springmvclearn.dao.impl.OrdersDaoImpl;
import com.springmvclearn.model.Orders;
import com.springmvclearn.service.OrdersManager;

@Transactional
@Service("OrdersManager")
public class OrdersServiceImpl implements OrdersManager {

	@Resource
	private OrdersDao ordersDao;

	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		ordersDao = ordersDao;
	}

	@Override
	public void saveOrders(Orders order) {
		ordersDao.saveOrders(order);
	}

	@Override
	public void deleteOrders(Orders order) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Orders> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Orders order) {
		// TODO Auto-generated method stub

	}

}
