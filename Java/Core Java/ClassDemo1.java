/* To accept a person's name and age and display if he is young, middle aged or old */

import java.io.*;

class Person {
	//instance variables
	private String name;
	private int age;
	
	//to accept the name and age
	public void accept() throws IOException{
		
		//to accept data from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept name and age
		System.out.print("Enter name: ");
		name = br.readLine();
		
		System.out.print("Enter age: ");
		age = Integer.parseInt(br.readLine());
	}
	
	//to check the age and display if he is young, middle aged or old
	public void check(){
		
		if (age<=30)
			System.out.println( name + " is young.");
		else if (age>30 && age<=50)
			System.out.println( name + " is middle aged.");
		else 
			System.out.println(name + " is old.");
	}
}

class ClassDemo1 {
	public static void main(String args[]) throws IOException{
		//create Person class object
		Person p = new Person();
		
		//accept person data
		p.accept();
		
		//check the age
		p.check();
	}
}