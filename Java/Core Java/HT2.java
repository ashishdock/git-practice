// Hashtable is rewritten using generic types in Java 5.0 and later
// as Hashtable<K,V>

import java.util.*;

class HT2
{
	public static void main(String args[])
	{
		//create Hashtable object using String and Integer types
		Hashtable<String, Integer> ht = new Hashtable<>();
		//store string type key and Integer type value
		ht.put("Ajay", 50);
		ht.put("Sachin", 90);
		ht.put("Dhoni", 75);
		//retrieve Sachin's score
		String s = "Sachin";
		Integer score = ht.get(s);  //casting is not required
		System.out.println("Score = " + score);
	}
}