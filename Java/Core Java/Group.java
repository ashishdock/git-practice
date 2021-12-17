//To store a group of objects in an array

import java.io.*;

class Employee 
{
	//instance variables
	int id;
	String name;
	
	//to store data
	Employee(int i, String n)
	{
		this.id = i;
		this.name = n;
	}
	
	// a method to display data
	void displayData()
	{
		System.out.println("ID: " + id + "\t" + "Name: "+ name);
	}
}

class Group
{
	public static void main(String args[]) throws IOException
	{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//create Employee type array with size 5
		Employee arr[] = new Employee[5];
		
		//store 5 employees' data into the array
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter Id:");
			int id = Integer.parseInt(br.readLine());
			
			System.out.print("Enter Name: ");
			String name = br.readLine();
			
			arr[i] = new Employee(id, name);
		}
		
		System.out.println("\nThe employee data is:");
		
		//display the employee data from the array
		for(int i=0; i<5; i++)
		{
			System.out.print("Employee # " + i + " ");
			arr[i].displayData();
		}
	}
}