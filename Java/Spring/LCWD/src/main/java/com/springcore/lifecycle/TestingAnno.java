package com.springcore.lifecycle;





public class TestingAnno {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "TestingAnno [subject=" + subject + "]";
	}

	public TestingAnno(String subject) {
		super();
		this.subject = subject;
	}

	public TestingAnno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void start()
	{
		System.out.println("Starting method...");
	}
	
	public void end()
	{
		System.out.println("Stopping method.");
	}
	
}
