//Reading textfile using FileInputStream

import java.io.*;

class ReadFile
{
	public static void main(String args[]) throws IOException
	{
		//attach the file to the FileInputStream
		FileInputStream fin = new FileInputStream("myfile.txt");
		System.out.println("File contents: ");
		
		//read characters from FileInputStream and write them to monitor. Repeat this till the end of file.
		int ch;
		
		while((ch=fin.read()) != -1)
				System.out.print((char)ch);
		
		//close the file
		fin.close();
	}
}