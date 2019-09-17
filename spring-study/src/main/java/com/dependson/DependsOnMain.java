package com.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenjianeng
 * @date 2019-08-03
 */
@Configuration
@ComponentScan
public class DependsOnMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DependsOnMain.class);
		context.close();
	}
}
