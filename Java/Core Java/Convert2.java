// A program to retrieve the numbers from an ArrayList and convert the resultant stream into an array

import java.util.*;
import java.util.stream.*;

class Convert2
{
	public static void main(String args[])
	{
		//create a list to store Integer objects
		List<Integer> lst = new ArrayList<Integer>();
		
		//add elements to the list
		for(int i=1; i<10; i++)
		{
			lst.add(i);
		}
		
		//convert this list into stream using stream()
		Stream<Integer> sm = lst.stream();
		
		//filter the elements which are lesser than 5 and collect them into an Integer type array using toArray(Integer[]::new)
		Integer[] arr = sm.filter(i -> i<5).toArray(Integer[]::new);
		
		//display the array
		for(Integer i : arr)
			System.out.println(i);
	}
}