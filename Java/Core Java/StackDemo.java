//Pushing, popping, searching elements in a stack

import java.io.*;
import java.util.*;

class StackDemo
{
	public static void main(String args[]) throws IOException
	{
		//create an empty stack to contain Integer objects
		Stack<Integer> st = new Stack<>();
		//take vars
		int choice = 0;
		int position, element;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//display the menu as long as user choice < 4
		while (choice < 4)
		{
			System.out.println("STACK OPERATIONS");
			System.out.println("1 - Push an element");
			System.out.println("2 - Pop an element");
			System.out.println("3 - Search an element");
			System.out.println("4 - Exit\n---");
			
			System.out.print("\t\t");
			choice = Integer.parseInt(br.readLine());
			
			//perform a task depending on user choice
			switch(choice)
			{
				case 1:
					System.out.print("\t\tEnter element: ");
					element = Integer.parseInt(br.readLine());
					//int type element is converted into Integer object and then pushed into the stack
					st.push(element);
					break;
				case 2:
					//the top most integer element is popped
					Integer obj = st.pop();
					System.out.println("\t\tPopped / Removed: " + obj);
					break;
				case 3:
					System.out.print("\t\tPlease enter the element to search for: ");
					element = Integer.parseInt(br.readLine());
					//int type element is converted into Integer object and then searched in the stack
					position = st.search(element);
					if(position == -1)
						System.out.println("\t\tElement not found!");
					else
						System.out.println("\t\tElement found at position: " + position);
					break;
				default:
					return;
			}
			
			//view the contents of stack
			System.out.println("\t\tStack contents: " + st);
		}
	}
}