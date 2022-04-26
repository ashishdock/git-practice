package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Whatever {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/configlc.xml");
		
//		TestingLC test1 = (TestingLC)context.getBean("test1");
//		// registering shutdown hook to run destroy method
//		context.registerShutdownHook();
//		System.out.println(test1);

//		
//		
//		System.out.println("---------------------------------------------");
//		
//		TestingInter inter1 = (TestingInter)context.getBean("inter1");
//		context.registerShutdownHook();
//		System.out.println(inter1);
//		
		System.out.println("---------------------------------------------");
		
		TestingAnno anno1 = (TestingAnno)context.getBean("anno1");
		context.registerShutdownHook();
		System.out.println(anno1);
	}

}
