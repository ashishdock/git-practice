// A program to understand  how to create streams of objects using the Stream.of() method

import java.util.stream.*;

class Create1
{
	public static void main(String args[])
	{
		//create a stream of Integer objects using Stream.of() method
		Stream<Integer> sm1 = Stream.of(10,11,12,13,14,15);
		
		//display the elements of the stream
		sm1.forEach(System.out::println);
		
		//create another stream of array of float objects
		Float arr[] = {1.1f, 2.2f, 3.3f, 4.4f};
		Stream<Float> sm2 = Stream.of(arr);
		
		sm2.forEach(System.out::println);
	}
}