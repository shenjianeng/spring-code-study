package com.shen;

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
}
