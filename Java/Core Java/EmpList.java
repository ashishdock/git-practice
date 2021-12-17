//To create an ArrayList of Employee objects and search for a particular Employee object based on id number

import java.util.*;
import java.io.*;

class EmployeeArrList
{
	//take variables
	int id;
	String name;
	String address;
	
	//initialize them
	EmployeeArrList (int i, String n, String a)
	{
		this.id = i;
		this.name = n;
		this.address = a;
	}
	
	//display employee details
	void display()
	{
		System.out.println("\tID\t: " + id);
		System.out.println("\tName\t: " + name);
		System.out.println("\tAddress\t:" + address);	
	}
}

class EmpList
{
	public static void main(String args[]) throws IOException
	{
		//vars
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		String address;
		
		//create an ArrayList arl to store Employee objects
		ArrayList<EmployeeArrList> arl = new ArrayList<>();
		
		//accept 5 employee's details and store into arl
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter id\t: ");
			id = Integer.parseInt(br.readLine());
			
			System.out.print("Enter Name\t: ");
			name = br.readLine();
			
			System.out.print("Enter Address\t: ");
			address = br.readLine();
			
			//create Employee object with accepted data
			EmployeeArrList obj = new EmployeeArrList(id, name, address);
			
			//store Employee object into arl
			arl.add(obj);
		}
		
		//Now search for an employee id
		System.out.print("Enter ID to search: ");
		id = Integer.parseInt(br.readLine());
		
		//found becomes true if employee id is found in arl
		boolean found = false;
		
		//search all elements in arl
		for(int i=0; i<arl.size(); i++)
		{
			//get() method of ArrayList will return i-th Employee object
			EmployeeArrList obj = arl.get(i);
			
			//check if the given id is equal to the ID of the Employee object
			if(id == obj.id)
			{
				obj.display(); //display that Employee data
				found = true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found!");
		}
	}
}