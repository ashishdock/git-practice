//Hashset Demo

import java.util.*;

class HashSetDemo
{
	public static void main(String args[])
	{
		//create a Hashset to store strings
		HashSet<String> hs = new HashSet<>();
		
		//store some string elements
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("America");
		
		//view the Hashset
		System.out.println("Hash set = " + hs);
		
		//add an Iterator to hs
		Iterator it = hs.iterator();
		
		//display elements by elements using iterator
		while(it.hasNext())
		{
			System.out.println((String)it.next());
		}
	}
}