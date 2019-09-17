package com.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

/**
 * @author shenjianeng
 * @date 2019-09-17
 */
@DependsOn("orderService")
@Service
public class UserService {

	public UserService() {
		System.out.println("UserService create");
	}


	@PreDestroy
	public void destroy() {
		System.out.println("UserService destroy");
	}
}
