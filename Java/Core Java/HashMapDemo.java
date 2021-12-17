//HashMap used as telephone book

import java.io.*;
import java.util.*;

class HashMapDemo
{
	public static void main(String args[]) throws IOException
	{
		//create HashMap
		HashMap<String, Long> hm = new HashMap<>();
		
		//vars
		String name, str;
		Long phno;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//menu
		while(true)
		{
			System.out.println("1 - Enter Phone entries");
			System.out.println("2 - Lookup in the book");
			System.out.println("3 - Display Names in books");
			System.out.println("4 - Exit");
			
			System.out.print("\t\tYour choice: ");
			int n = Integer.parseInt(br.readLine());
			
			switch(n)
			{
				case 1:
					System.out.print("\t\tEnter name: ");
					name = br.readLine();
					System.out.print("\t\tEnter phone no.: ");
					str = br.readLine();
					//phno = new Long(str); //This is deprecated
					phno = Long.valueOf(str);
					hm.put(name, phno);
					break;
				case 2:
					System.out.print("\t\tEnter name to look up (Please match case): ");
					name = br.readLine();
					name = name.trim(); //remove unnecessary spaces
					phno = hm.get(name);
					System.out.println("\t\tPhone no. of " + name + " is " + phno);
					break;
				case 3:
					//use keySet() to display the names
					//create HashSet object to store names and refer it by Set reference
					Set<String> set = new HashSet<String>();
					set = hm.keySet();
					System.out.println("\t\t The names in address book are: " + set);
					break;
				default:
					return;
			}
		}
	}
}