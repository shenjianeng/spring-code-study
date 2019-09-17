package com.dependson;

import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

/**
 * @author shenjianeng
 * @date 2019-09-17
 */
@Service
public class OrderService {

	public OrderService() {
		System.out.println("OrderService create");
	}


	@PreDestroy
	public void destroy() {
		System.out.println("OrderService destroy");
	}
}
