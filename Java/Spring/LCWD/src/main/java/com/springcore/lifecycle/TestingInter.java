package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestingInter implements InitializingBean, DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TestingInter [price=" + price + "]";
	}

	public TestingInter(double price) {
		super();
		this.price = price;
	}

	public TestingInter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// this will work like init. This is init for interface, for autowiring, for using annotation
		System.out.println("Initializing...");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// this works like destroy() for interface, autowiring, annotation 
		System.out.println("Destroying...");
	}
	
	
	
}
