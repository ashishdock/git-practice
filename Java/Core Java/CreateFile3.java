//storing strings into a file

import java.io.*;

class CreateFile3
{
	public static void main(String args[]) throws IOException
	{
		//to read strings from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		//open file for writing
		FileWriter fw = new FileWriter("stringsfile.txt");
		
		//read strings and store in the file till exit is typed
		System.out.println("Enter data: ");
		while(!(str = br.readLine()).equals("exit"))
			fw.write(str+"\n");
		
		//close the file
		fw.close();
	}
}