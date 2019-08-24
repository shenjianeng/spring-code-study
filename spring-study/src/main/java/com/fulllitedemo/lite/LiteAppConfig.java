package com.fulllitedemo.lite;

import com.fulllitedemo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author shenjianeng
 * @date 2019-08-18
 */
@Component
public class LiteAppConfig {

	@Bean
	public User user() {
		System.out.println("user() 方法执行");
		return new User();
	}

	@Bean
	public String name(User user) {
		System.out.println("name(User user) 方法执行");
		System.out.println(user.hashCode());
		System.out.println("再次调用user()方法: " + user().hashCode());
		return "123";
	}
}
