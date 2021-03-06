/* To accept a person's name and age and display if he is young, middle aged or old */

import java.io.*;

class Person {
	//instance variables
	private String name;
	private int age;
	
	//to accept the name and age
	Person(String s, int i){
			
		name = s;
		age = i;
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

class ClassDemoCLargs {
	public static void main(String args[]){
		//create Person class object
		Person p = new Person(args[0], Integer.parseInt(args[1]));
		
		//check the age
		p.check();
	}
}