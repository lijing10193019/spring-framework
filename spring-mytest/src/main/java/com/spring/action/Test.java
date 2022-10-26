package com.spring.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author  lijing
 * @date  2022/10/26 14:58
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("Spring-test");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
