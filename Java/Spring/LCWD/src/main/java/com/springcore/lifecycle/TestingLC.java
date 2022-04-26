package com.springcore.lifecycle;

public class TestingLC {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price.");
		this.price = price;
	}

	@Override
	public String toString() {
		return "TestingLC [price=" + price + "]";
	}

	public TestingLC(int price) {
		super();
		this.price = price;
	}

	public TestingLC() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	
	
}
