// A program to create a stream with the elements of an ArrayList and get the elements which are greater than 5 into a new list

import java.util.*;
import java.util.stream.*;

class Convert1
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
		
		//filter the elements which are greater than 5 and collect them into a list using collect(Collectors.toList())
		List<Integer> lst1 = sm.filter(i -> i>5).collect(Collectors.toList());
		
		//display the new list
		System.out.println(lst1);
	}
}