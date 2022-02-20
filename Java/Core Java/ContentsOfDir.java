//Display the contents of a directory

import java.io.*;

class ContentsOfDir
{
	public static void main(String args[]) throws IOException
	{
		// enter the path and dir name from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter dirpath: ");
		String dirpath = br.readLine();
		System.out.print("Enter dirname: ");
		String dname = br.readLine();
		
		//create File object with dirpath and dname
		File f = new File(dirpath, dname);
		
		//if directory exists, then
		if(f.exists())
		{
			//get the contents into arr[]
			//now arr[i] represents either a file or sub directory
			String arr[] = f.list();
			
			//find no. of entries in the directory
			int n = arr.length;
			
			//display the entries
			for(int i=0; i<n; i++)
			{
				System.out.print(arr[i]);
				//create File object with the entry and test if it is a file or directory
				File f1 = new File(arr[i]);
				if(!f1.isDirectory()) System.out.println(": is a file");
				if(f1.isDirectory()) System.out.println(": is a directory.");
			}
			System.out.println("No. of entries in this directory: " + n);
		}
		else System.out.println("Directory does not exist.");
	}
}