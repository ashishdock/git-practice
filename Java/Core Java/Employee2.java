//Employee class

import java.io.*;
import java.util.*;

class Employee2 implements Serializable
{
	int id;
	String name;
	float sal;
	Calendar doj;
	
	void displayData()
	{
		int yy = doj.get(Calendar.YEAR);
		int mm = doj.get(Calendar.MONTH);
		mm++; //since Jan is stored as 0
		int dd = doj.get(Calendar.DATE);
		
		System.out.printf("%-10d %s %10.2f %2d-%2d-%4d\n", id, name, sal, dd, mm, yy);
	}
	
	void getData() throws IOException
	{
		//to read data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter emp id: ");
		id = Integer.parseInt(br.readLine());
		System.out.print("Enter name: ");
		name = br.readLine();
		System.out.print("Enter salary: ");
		sal = Float.parseFloat(br.readLine());
		
		//accept date of joining from keyboard
		System.out.println("Enter date of joining: ");
		System.out.print("Enter day: ");
		int dd = Integer.parseInt(br.readLine());
		
		System.out.print("Enter month: ");
		int mm = Integer.parseInt(br.readLine());
		mm--; //since jan is stored as 0
		
		System.out.print("Enter year: ");
		int yy = Integer.parseInt(br.readLine());
		
		//store date of joining into calendar object
		doj = Calendar.getInstance();
		doj.set(yy, mm, dd);
	}
}