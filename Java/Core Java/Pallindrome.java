// Pallindrome or not

import java.io.*;

class Pallindrome {
	public static void main(String args[]) throws IOException{
		//accept the string from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string to check if it is a pallindrome: ");
		String pal = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(pal);
		
		if(pal.equalsIgnoreCase((sb.reverse()).toString()))
			System.out.print("This is a pallindrome.");
		else System.out.println("This is not a pallindrome.");
	}
}