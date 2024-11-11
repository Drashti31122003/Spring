package com.springcore.lifecycle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Department d1=(Department)context.getBean("d1");
		System.out.println(d1);
		context.registerShutdownHook();
			
	}

}
