//Creating a vector with Integer elements

import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		//take a vector to store Integer objects
		Vector<Integer> v = new Vector<>();
		
		//take an int type array
		int x[] = {22, 20, 10, 40, 15, 60};
		
		//when x[i] is stored into v below. x[i] values are converted into Integer objects and stored into v. This is auto boxing.
		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}
		
		//retrieve the elements using get()
		System.out.println("Vector Elements");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		
		//retrieve using listIterator
		System.out.println("Elements using ListIterator: ");
		ListIterator lit = v.listIterator();
		
		System.out.print("In forward direction: ");
		while(lit.hasNext())
		{
			System.out.print(lit.next() + " ");
		}
		
		System.out.print("\nIn reverse direction: ");
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous() + " ");
		}
	}
}