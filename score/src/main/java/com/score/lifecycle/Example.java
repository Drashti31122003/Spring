package com.score.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String sub;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		
	}

	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("subject start");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("subject end");
	}
}
