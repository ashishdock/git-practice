// Searching for a string - Linear Search

import java.io.*;

class LinearSearch {
	public static void main(String args[]) throws IOException{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ask how many strings
		System.out.print("How many Strings? ");
		int n = Integer.parseInt(br.readLine());
		System.out.println();
		
		//create a string type array with size n
		String str[] = new String[n];
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter string #" + (i+1) +": ");
			str[i] = br.readLine();
		}
		
		System.out.print("Enter the string to search: \t");
		String search = br.readLine();
		
		boolean found = false;
		
		for(int i= 0; i<n; i++) {
			if(search.equalsIgnoreCase(str[i])){
				System.out.println("Found string: " + search + " at position " + (i+1));
				found = true;
			}
		}
		if(!found) System.out.println("Search word not found!");
		
	}
}