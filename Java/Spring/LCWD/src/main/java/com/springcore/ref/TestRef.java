package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp = (A)context.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
		
		System.out.println(temp);
		
		
		A temp1 = (A)context.getBean("aref1");
		System.out.println(temp1);
		
		System.out.println(temp1.getX());
		
		System.out.println(temp1.getOb().getY());
	}

}
