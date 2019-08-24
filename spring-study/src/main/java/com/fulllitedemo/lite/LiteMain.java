package com.fulllitedemo.lite;

import com.fulllitedemo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shenjianeng
 * @date 2019-08-18
 */
public class LiteMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LiteAppConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user.hashCode());
		context.close();
	}
}
