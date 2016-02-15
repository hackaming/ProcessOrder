package com.springmvclearn.service;

import java.util.List;

import com.springmvclearn.model.Orders;

public interface OrdersManager {
	public void saveOrders(Orders order);
	public void deleteOrders(Orders order);
	public List<Orders> findById(int id);
	public List<Orders> findAll();
	public void update(Orders order);
}