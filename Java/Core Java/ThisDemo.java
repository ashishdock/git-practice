// this - refers to all members of present class

class Sample1 {
	// x is instance variable
	private int x;
	//default constructor
	Sample1() {
		this(55); //call present class para constructor and send 55
		this.access(); //call present class method
	}
	//parameterized constructor
	Sample1(int x){
		this.x = x;
	}
	
	//method
	void access(){
		System.out.println("x = " + x);
	}
}

class ThisDemo{
	public static void main(String args[]){
		Sample1 s = new Sample1();
	}
}