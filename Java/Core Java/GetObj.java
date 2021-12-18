//deserialization -> to retrieve objects from objfile

import java.io.*;
import java.util.*;

class GetObj
{
	public static void main(String args[]) throws Exception
	{
		//connect FileInputStream to objfile
		FileInputStream fis = new FileInputStream("objfile.txt");
		
		//connect ObjectInputStream to FileInputStream
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//read objects from ois and store data into Employee object e
		try
		{
			Employee2 e;
			while((e=(Employee2)ois.readObject()) != null)
			{
				//display data of e on monitor
				e.displayData();
			}
		}
		catch(EOFException ee)
		{
			System.out.println("End of File reached!");
		}
		finally
		{
			//close the file
			ois.close();
		}
	}
}