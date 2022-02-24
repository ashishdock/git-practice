// a program to create a function that returns the length of a string

import java.util.function.*;

class FunctionDemo1
{
	public static void main(String args[])
	{
		//create a function reference to lambda expression to find length of a string
		Function<String, Integer> len = (str) -> str.length();
		
		//find the length of the string str
		String str = "Ashish Sharma is the best";
		System.out.println("Length = " + len.apply(str));
	}
}