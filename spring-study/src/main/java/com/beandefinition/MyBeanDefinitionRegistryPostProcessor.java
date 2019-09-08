package com.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author shenjianeng
 * @date 2019-09-08
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(OrderService.class)
				//这里的属性名是根据setter方法
				.addPropertyReference("dao", "orderDao")
				.setInitMethodName("init")
				.setScope(BeanDefinition.SCOPE_SINGLETON)
				.getBeanDefinition();

		registry.registerBeanDefinition("orderService", beanDefinition);

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//do nothing
	}
}
