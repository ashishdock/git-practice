// Creating our own factory method

import java.io.*;

// an interface with an abstract method
interface Fees {
	double showFees(); //this method does not have a body
}

//implementation class to implement showFees() method
class CSE implements Fees{
	public double showFees() {
		return 60000.00;
	}
}

//another implementation class to implement showFess()
class ECE implements Fees{
	public double showFees(){
		return 55000.50;
	}
}

//factory class with a factory method getFees()
class CourseFees {
	public static Fees getFees(String course){
		if(course.equalsIgnoreCase("CSE"))
			return new CSE();
		if(course.equalsIgnoreCase("ECE"))
			return new ECE();
		else
			return null;
	}
}

/* using the factory method getFees() to display any course fees depending on user option */
class FactoryMethodInterfaceTest{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a course name to get the fees for it: ");
		String name = br.readLine();
		Fees f = CourseFees.getFees(name);
		System.out.println("The fees is Rs " + f.showFees());
	}
}