package com.shen;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shenjianeng
 * @date 2019-08-03
 */
public class Main {
	public static void main(String[] args) {
//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "spring-study/docs/classes");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		UserBean userBean = (UserBean) context.getBean("getUserBean");
		FactoryBean factoryBean = (FactoryBean) context.getBean("&getUserBean");
//		UserService userService = context.getBean(UserService.class);
//		userService.login();
		context.close();
	}
}
