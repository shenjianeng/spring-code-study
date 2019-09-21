package com.shen;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author shenjianeng
 * @date 2019-08-03
 */
@PropertySource(value = "application.properties")
@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public String name() throws Exception {
		System.out.println("name()");
//		getUserBean().getObject();
		return "程序员小黑";
	}


	@Bean
	public FactoryBean getUserBean() {
		System.out.println("getUserBean()");
		return new FactoryBean<UserBean>() {
			@Override
			public UserBean getObject() throws Exception {
				System.out.println("1111");
				return new UserBean("shen", 17);
			}

			@Override
			public Class<?> getObjectType() {
				return UserBean.class;
			}
		};
	}
}
