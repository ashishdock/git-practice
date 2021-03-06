//Hashtable with cricket player names and their scores

import java.io.*;
import java.util.*;

class HashtableDemo
{
	public static void main(String args[]) throws IOException
	{
		//create Hashtable with names and scores
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Ajay", 50);
		ht.put("Sachin", 77);
		ht.put("Gavaskar", 44);
		ht.put("Kapil", 60);
		ht.put("Dhoni", 88);
		
		//display all player names using enumerator
		System.out.println("The player names: ");
		Enumeration e = ht.keys();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//accept player name from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\t\tEnter player name (please match case): ");
		String name = br.readLine();
		name = name.trim();
		
		//get score of the player
		Integer score = ht.get(name);
		System.out.println(score);
		if(score != null)
		{
			//convert score from Integer object to int value
			int sc = score.intValue();
			System.out.println("\t\t" + name + " scored " + sc);
		}
		else
		{
			System.out.println("Player not found!");
		}
	}
}