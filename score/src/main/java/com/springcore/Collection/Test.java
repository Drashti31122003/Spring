package com.springcore.Collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.score.lifecycle.Example;

public class Test {
	
    private static AbstractApplicationContext context;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context2.registerShutdownHook();


		

		System.out.println("------------------------------------------------------------------------------------");
		Example ex1=(Example)context2.getBean("ex1");
		System.out.println(ex1);
		
		}

}