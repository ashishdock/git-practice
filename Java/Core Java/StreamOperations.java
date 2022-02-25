// A program to understand how to perform some important operations on streams using Stream class methods

import java.util.*;
import java.util.stream.*;

class StreamOperations
{
	public static void main(String args[])
	{
		//take a string type array and convert into a list
		List<String> lst = Arrays.asList("USA", "Japan", "India", "China", "", "Russia", "UK");
		//count the no. of strings with length more than 4 characters
		long n = lst.stream().filter(x -> x.length()>4).count();
		System.out.println("No. of strings with length more than 4: \n" + n);
		
		//count number of strings which start with U
		n = lst.stream().filter(x -> x.startsWith("U")).count();
		System.out.println("No. of strings that start with U are: " + n);
		
		//remove all empty strings from the list and collect them into another list
		List<String> lst1 = lst.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("The list after removing the empty strings:\n " + lst1);
		
		//sort the stream and then convert into upper case and then collect into another list
		List<String> lst2 = lst1.stream().sorted().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println("The list after sorting in uppercase: \n" + lst2);
		
		//convert all strings to capital letters and collect them into an array
		String[] arr = lst2.stream().map(x -> x.toUpperCase()).toArray(String[]::new);
		System.out.println("Array of sorted strings in uppercase: ");
		for(String i: arr) System.out.print(i + " ");
	}
}