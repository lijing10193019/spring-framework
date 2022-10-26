package com.spring.action;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijing
 * @date 2022/10/26 14:25
 */
@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user(){
		return new User("10010","lijing");
	}
}
