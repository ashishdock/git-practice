//serialization -> to store Employee class objects into obj file.

import java.io.*;
import java.util.*;

class StoreObj
{
	public static void main(String args[])throws Exception
	{
		//to read data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//connect FileOutputStream to the objfile
		FileOutputStream fos = new FileOutputStream("objfile.txt");
		
		//connect ObjectOutputStream to the FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//ask how many employees
		System.out.print("How many employees? ");
		int n = Integer.parseInt(br.readLine());
		
		//do for n employees
		for(int i=0; i<n; i++)
		{
			//create employee object
			Employee2 e = new Employee2();
			
			//store data into e
			e.getData();
			
			//write data from e into objectfile
			oos.writeObject(e);
		}
		//close the file
		oos.close();
	}
}