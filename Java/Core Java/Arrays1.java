//Sorting an array with a group of Integer objects

import java.util.*;
import java.io.*;

//to sort into scending order
class Ascend implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return i1.compareTo(i2);
	}
}

//to sort into descending order
class Descend implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}
}

class Arrays1
{
	public static void main(String args[]) throws IOException
	{
		//to accept array elements from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many elements? ");
		int size = Integer.parseInt(br.readLine());
		
		//create an array to sore Integer type objects
		Integer arr[] = new Integer[size];
		
		//Below, we pass int values to the array but they are converted into Integer objects and then stored
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter int: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//sort the array in ascending order
		Arrays.sort(arr, new Ascend());
		
		//display the sorted array
		System.out.println("\nSorted in Ascending order: ");
		display(arr);
		
		//in descending order
		Arrays.sort(arr, new Descend());
		System.out.println("\nSorted in descending order: ");
		display(arr);
	}
	
	static void display(Integer arr[])
	{
		for(Integer i: arr)
			System.out.print(i + "\t");
	}
}