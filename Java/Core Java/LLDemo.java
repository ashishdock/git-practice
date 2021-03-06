// A linked list with strings

import java.io.*;
import java.util.*;

class LLDemo
{
	public static void main(String args[]) throws IOException	
	{
		//create an empty linked list to store strings
		LinkedList<String> ll = new LinkedList<>();
		
		//add some names to linked list
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		
		//display the elements in the linked list
		System.out.println("List: " + ll);
		
		//vars
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position, choice = 0;
		
		//menu
		while(choice<4)
		{
			System.out.println("\nLINKEDLIST OPERATIONS");
			System.out.println("1 - Add an element");
			System.out.println("2 - Remove an element");
			System.out.println("3 - Change an element");
			System.out.println("4 - Exit");
			
			System.out.print("\t\tYour choice: ");
			choice = Integer.parseInt(br.readLine());
			
			//perform a task based on the user choice
			switch(choice)
			{
				case 1:
					System.out.print("\t\tEnter the element to add: ");
					element = br.readLine();
					System.out.print("\t\tAt what position: ");
					position = Integer.parseInt(br.readLine());
					ll.add((position-1), element);
					break;
				case 2:
					System.out.print("\t\tEnter the position of the element to remove: ");
					position = Integer.parseInt(br.readLine());
					ll.remove(position-1);
					break;
				case 3:
					System.out.print("\t\tEnter position of the element to replace: ");
					position = Integer.parseInt(br.readLine());
					System.out.print("\t\tEnter the name to replace with: ");
					element = br.readLine();
					ll.set(position-1, element);
					break;
				default:
					return;
			}
			
			System.out.println("\t\t--Current Elements in LinkedList--: " + ll);
			
			//use iterator to retrieve the elements
			System.out.print("\t\t***List in list form***: ");
			Iterator it = ll.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next() + " ");
			}
		}
	}
}