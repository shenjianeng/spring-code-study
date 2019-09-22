package com.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author shenjianeng
 * @date 2019-09-22
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class OrderService {
}
