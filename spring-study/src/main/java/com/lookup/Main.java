package com.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenjianeng
 * @date 2019-09-22
 */
@Configuration
@ComponentScan
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Main.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.getOrderServiceUsingLookup() == userService.getOrderServiceUsingLookup());


		OrderService orderService = userService.getOrderService();
		OrderService orderService1 = userService.getOrderService();
		System.out.println(orderService == orderService1);
	}
}
