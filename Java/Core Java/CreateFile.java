//Creating a text file using FileOutputStream

import java.io.*;

class CreateFile
{
	public static void main(String args[]) throws IOException
	{
		//attach keyboard to DataInputStream
		DataInputStream dis = new DataInputStream(System.in);
		
		//attach myfile to FileOutputStream 
		FileOutputStream fout =  new FileOutputStream("myfile.txt");
		
		System.out.println("Enter text(@ at the end): ");
		
		char ch;
		
		//read characters from dis into ch. Then write them into fout.
		//repeat this as long as the read character is not @
		while((ch=(char)dis.read()) != '@')
			fout.write(ch);
		
		//close the file
		fout.close();
	}
}