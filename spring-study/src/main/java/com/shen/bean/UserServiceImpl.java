package com.shen.bean;

import org.springframework.stereotype.Service;

/**
 * @author shenjianeng
 * @date 2019-08-03
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void login() {
		System.out.println("user login...");
	}
}
