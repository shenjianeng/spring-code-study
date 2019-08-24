package com.fulllitedemo.full;

import com.fulllitedemo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenjianeng
 * @date 2019-08-18
 */
@Configuration
public class AppConfig {

	@Bean
	public static int aga() {
		System.out.println("aga()...");
		return 12;
	}

	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public String name(User user, int age) {
		System.out.println(user.hashCode());
		System.out.println(user().hashCode());
		aga();
		aga();
		return "123";
	}
}
