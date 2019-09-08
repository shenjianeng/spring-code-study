package com.beandefinition;

/**
 * @author shenjianeng
 * @date 2019-09-08
 */
public class OrderService {

	private OrderDao orderDao;

	public void setDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void init() {
		System.out.println("OrderService init...");
	}

	public void query() {
		orderDao.query();
	}
}
