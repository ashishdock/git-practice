//Polymorphism

import java.io.*;

class PolyPractice{
	public static void main(String args[]) throws IOException{
		
		Squarex a = new Squarex();
		a.calculate(2);
		
		Cubex b = new Cubex();
		b.calculate(2);
	}
	
}

class Squarex {
	void calculate(int x){
		System.out.println("The square of " + x + " is " + (x*x) + ".");
	}
}

class Cubex extends Squarex{
	void calculate(int x){
		System.out.println("The cube of " + x + " is " + (x*x*x) + ".");
	}
}