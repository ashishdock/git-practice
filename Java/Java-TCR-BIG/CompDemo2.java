// Pass a lambda expression to create a reverse comparator
import java.util.*;

class CompDemo2
{
	public static void main(String args[])
	{
		// Pass a reverse comparator to TreeSet() via a lambda expression.
		TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
		
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		// Dislpay the elements.
		for(String e : ts)
			System.out.print(e + " ");
	}
}