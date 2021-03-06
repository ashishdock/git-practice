/* Display a test file.
	To use this program, specify the name of the file that you want to see.
	For example, to see a file called Test.txt, use the following command line
	
	java ShowFile Test.txt
	
	This variation wraps the code that opens and accesses the file within a single try block. The file is closed by the finally block.
	Removing the catch clause for FileNotFoundException as it is a subclass of IOException
*/

import java.io.*;

class ShowFile3
{
	public static void main(String args[])
	{
		int i;
		FileInputStream fin = null;
		
		//First, confirm that a filename has been specified.
		if(args.length != 1)
		{
			System.out.println("Usage: java Showfile <filename>");
			return;
		}
		
		//The following code opens a file, reads characters until EOF is encountered, and then closes the file via a finally block.
		try
		{
			fin = new FileInputStream(args[0]);
			
			do
			{
				i = fin.read();
				if(i!=-1) System.out.print((char)i);
			}
			while (i!=-1);
		}
		catch(IOException e)
		{
			System.out.println("An I/O Error Occured: " + e);
		}
		finally
		{
			//close the file in all cases
			try
			{
				if(fin!=null) fin.close();
			}
			catch(IOException e)
			{
				System.out.println("Error Closing File.");
			}
		}
	}
}