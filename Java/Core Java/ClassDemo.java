// Creating a class and object
class Person {
	// properties - variables
	private String name;
	private int age;
	
	//default constructor
	Person(){
		name = "Raju";
		age = 22;
	}
	
	//parameterized constructor
	Person(String s, int i){
		name = s;
		age = i;
	}
	//actions-methods
	void talk(){
		System.out.println("Hello I am " + name);
		System.out.println("My age is " + age);
	}
}

class ClassDemo {
	public static void main(String args[]){
		//create Person class object: Raju
		Person Raju = new Person();
		
		//find the hash code of object
		System.out.println("Hash code: " + Raju.hashCode());
		
		//initialize the instance variables
		//Raju.name = "Raju";
		//Raju.age = 22;
		
		//call the talk method
		Raju.talk();
		
		Person Tina = new Person("Tina", 20);
		Tina.talk();
	}
}