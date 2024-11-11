package com.score.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/score/lifecycle/config.xml");
		department d1=(department)context.getBean("d1");
		System.out.println(d1);
		context.registerShutdownHook();
		
		
	}

}
