package com.springcore.constructorinjection;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	
	public Person(String name, int personId, Certi certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}
	
	
	
	
}
