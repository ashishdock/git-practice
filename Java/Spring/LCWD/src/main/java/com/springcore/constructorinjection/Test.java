package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
		Person p1 = (Person)context.getBean("p1");
		
		System.out.println(p1);
	}

}