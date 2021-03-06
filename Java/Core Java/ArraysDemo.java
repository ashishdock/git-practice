//Sortong and searching an array

import java.io.*;
import java.util.*;

class ArraysDemo
{
	public static void main(String args[]) throws IOException
	{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//create an array
		int arr[] = new int[5];
		
		//store element int arr[]
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//display the arr[] contents
		System.out.println("Contents of the array: ");
		display(arr);
		
		//sort the arr[] into ascending order
		Arrays.sort(arr);
		
		//display the sorted contents
		System.out.println("The sorted array: ");
		display(arr);
		
		//Now search for an element
		System.out.print("which element to search? ");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr, element);
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found at position " + (index+1));
		
	}
	//display method- uses for each loop
	static void display(int arr[])
	{
		for(int i: arr)
			System.out.println(i);
	}
}