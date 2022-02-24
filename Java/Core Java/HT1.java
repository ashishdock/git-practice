//HashTable before Java 5.0 - no generic type concept

import java.util.*;

class HT1
{
	public static void main(String args[])
	{
		//create Hashtable object
		Hashtable ht = new Hashtable();  //generic types not used
		
		//store String type key and Integer type value
		ht.put("Ajay", new Integer(50)); //auto boxing is not used
		ht.put("Sachin", new Integer(90));
		ht.put("Dhoni", new Integer(75));
		
		//retrieve Sachin's score
		String s = "Sachin";
		
		Integer score = (Integer)ht.get(s);  //casting is required
		System.out.println("Score = " + score);
	}
}