//Reading data from a file using FileReader

import java.io.*;

class ReadFile1
{
	public static void main(String args[]) throws IOException
	{
		//var
		int ch;
		
		//check if file exists or not
		FileReader fr = null;
		
		//check if file exists or not
		try
		{
			fr = new FileReader("text");
		}
		catch(FileNotFoundException fne)
		{
			System.out.println("File not found");
			return;
		}
		
		//read from filereader till the end of file
		while((ch=fr.read()) != -1)
			System.out.print((char)ch);
		
		//close the file
		fr.close();
	}
}