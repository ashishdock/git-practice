//Reading data from text file - version 2

import java.io.*;

class ReaderFile
{
	public static void main(String args[]) throws IOException
	{
		//to accept filename from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter file name: ");
		String fname = br.readLine();
		
		//attach the file to FileInputStream
		FileInputStream fin = null; //assign nothing to fin
		
		//check if file exists or not
		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found!");
			return;
		}
		
		//attach FileInputStream to BufferedInputStream
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		System.out.println("File Contents: ");
		
		//read characters from BufferedInputStream and write them to monitor. Repeat till the end of file.
		int ch;
		
		while((ch=bin.read()) != -1)
			System.out.print((char)ch);
		
		//close the file
		bin.close();
	}
}