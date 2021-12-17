//Creating a text file using Filewriter

import java.io.*;

class CreateFile2
{
	public static void main(String args[]) throws IOException
	{
		//take a string
		String str = "This is a book on Java." + "\nI am learning Java.";
		
		//attach file to FileWriter
		FileWriter fw = new FileWriter("text.txt");
		
		//read character wise from string and write into FileWriter
		for(int i=0; i<str.length(); i++)
			fw.write(str.charAt(i));
		
		//close the file
		fw.close();
	}
}