//ArrayList with String object
import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		//create ArrayList
		ArrayList<String> arl = new ArrayList<>();
		
		//add four objects
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		
		//display contents
		System.out.println("Contents: " + arl);
		
		//remove two objects
		arl.remove(3);
		arl.remove("Apple");
		
		//display again
		System.out.println("Contents after Removing: " + arl);
		
		//display its size
		System.out.println("Size of ArrayList: " + arl.size());
		
		//extract elements using Iterator
		System.out.println("Extracting using iterator");
		
		Iterator it = arl.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}