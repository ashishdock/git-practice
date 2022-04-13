// Use Scanner to compute an average a list of comma-separated values.
import java.util.*;
import java.io.*;

class SetDelimiters
{
	public static void main(String args[]) throws IOException
	{
		int count = 0;
		double sum = 0.0;
		
		// Write output to a file.
		FileWriter fout = new FileWriter("test.txt");
		
		// Now, store values in comma-separated list.
		fout.write("2, 3.4, 5, 6, 7.4, 9.1, 10.5, done");
		fout.close();
		
		FileReader fin = new FileReader("test.txt");
		
		Scanner sc = new Scanner(fin);
		
		// Set delimiters to space and comma.
		sc.useDelimiter(", *");
		
		// Read and sum numbers.
		while(sc.hasNext())
		{
			if(sc.hasNextDouble())
			{
				sum += sc.nextDouble();
				count++;
			}
			else
			{
				String str = sc.next();
				if(str.equals("done")) break;
				else
				{
					System.out.println("File format error.");
					return;
				}
			}
		}
		
		sc.close();
		System.out.println("Average is " + sum / count);
	}
}
