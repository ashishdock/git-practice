//A string broken into pieces at spaces

import java.util.*;

class StrTokenDemo
{
	public static void main(String args[])
	{
		//take a string
		String str = "He is a gentle man";
		
		//break into tokens at spaces, Here delimiter is a spce
		StringTokenizer st = new StringTokenizer(str, " ");
		
		//retrieve tokens from st and display
		System.out.println("The tokeans are: ");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}