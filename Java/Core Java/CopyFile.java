//Copying a file contents as another file

import java.io.*;

class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		//take a var
		int ch;
		
		/* open args[0] file for reading data and args[1] file for writing data into it.
		Here, we are using try-with-resource statement.*/
		
		//try
		{
			FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]);
		
			//read from FileInputStream and write into FileInputStream
			while((ch=fin.read()) != -1)
			fout.write(ch);
		}
		System.out.println("1 file copied.");
	}
}