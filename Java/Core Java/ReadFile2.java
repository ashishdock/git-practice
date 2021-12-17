// reading string wise from a file

import java.io.*;

class ReadFile2
{
	public static void main(String args[]) throws IOException
	{
		String str;
		
		//connect FileReader to the text file
		FileReader fr = new FileReader("stringsfile");
		
		//connect BufferedReader to FileReader 
		BufferedReader br = new BufferedReader(fr);
		
		//read string by string from br and display
		while((str=br.readLine()) != null)
			System.out.println(str);
		
		//close the file
		fr.close();
	}
}