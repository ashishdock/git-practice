// static method trying to access instance variables

class Test {
	//instance variables
	static int x;
	int y;
	//parameterized constructor
	Test(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//static method accessing x value
	static void accessst(){
		System.out.println("x = " + x);
	}
	
	void accessy(){
		System.out.println("y = " + y);
	}
}

class StaticDemo1 {
	public static void main(String args[]){
		Test obj1 = new Test(55, 60);
		System.out.println("Created obj1 with x = 55, y = 60");
		obj1.accessst();
		obj1.accessy();
		System.out.println();
		
		Test obj2 = new Test(99, 19);
		System.out.println("Created obj2 with x = 99, y = 19");
		obj2.accessst();
		obj2.accessy();
		System.out.println();
		
		System.out.println("Calling obj1 again which was initiated with x = 55, y = 60");
		obj1.accessst();
		obj1.accessy();
		System.out.println();
		
		System.out.println("This proves that any method or variable that is declared as 'static' has it's same value used by all objects of the class. The same value of 'static' is shared by all instances of a class. But if it is not 'static' all objects will have their own value of that 'non-static' method/variable. ");
	}
}