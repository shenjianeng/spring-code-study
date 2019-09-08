package com.beandefinition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenjianeng
 * @date 2019-09-08
 */
@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.query();
		context.close();
	}
}
