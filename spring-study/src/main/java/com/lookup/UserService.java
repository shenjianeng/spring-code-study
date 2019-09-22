package com.lookup;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author shenjianeng
 * @date 2019-09-22
 */
@Service
public abstract class UserService implements ApplicationContextAware {

	private ApplicationContext context;

	public OrderService getOrderService() {
		return context.getBean(OrderService.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}


	@Lookup
	public abstract OrderService getOrderServiceUsingLookup();
}
