// to create a stream of objects using Stream.generate(), which executes an expression repeatedly and stores the returned values in the stream class object

import java.util.stream.*;

class Create2
{
	public static void main(String args[])
	{
		//create the stream from random numbers
		Stream<Double> sm = Stream.generate(() -> {return Math.random();});
		
		//display the elements of the stream
		sm.forEach(System.out::println);
	}
}