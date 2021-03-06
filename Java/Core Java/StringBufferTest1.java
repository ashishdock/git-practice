// To compose full name of a person

import java.io.*;
class StringBufferTest1 {
	public static void main(String args[]) throws IOException{
		
		//create empty string buffer object
		StringBuffer sb = new StringBuffer();
		
		// to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// accept surname
		System.out.print("Enter firstname: ");
		String first = br.readLine();
		
		//accept middlename
		System.out.print("Enter middlename: ");
		String mid = br.readLine();
		
		//acept Lastname
		System.out.print("Enter lastname: ");
		String last = br.readLine();
		
		//append sur to sb
		sb.append(first);
		
		//apend last to sb
		sb.append(last);
		
		//display the name till now
		System.out.println("Name: " + sb);
		
		//insert middle name after surname in sb
		sb.insert(first.length(), mid);
		
		//display full name
		System.out.println("Full name: " + sb);
		
		//reverse and display the name
		System.out.println("In reverse: " + sb.reverse());
		
	}
}