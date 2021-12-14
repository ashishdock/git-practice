// static method trying to access instance variables

class Test {
	//instance variables
	int x;
	//parameterized constructor
	Test(int x){
		this.x = x;
	}
	
	//static method accessing x value
	static void access(){
		System.out.println("x = " + x);
	}
}

class StaticDemo {
	public static void main(String args[]){
		Test obj = new Test(55);
		obj.access();
	}
}