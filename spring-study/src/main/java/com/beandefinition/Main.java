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
		//能成功从容器中获取orderService,并成功调用orderService.query();方法
		OrderService orderService = context.getBean(OrderService.class);
		orderService.query();
		OrderService orderService2 = context.getBean(OrderService.class);
		//false,orderService已经不是单例
		System.out.println(orderService == orderService2);
		context.close();
	}
}
