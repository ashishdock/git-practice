//Accept a character from keyboard and display what it is

import java.io.*;

class charTest
{
	public static void main(String args[]) throws IOException
	{
		// to accept a char from keyboard
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) //execute repeatedly
		{
			System.out.print("Enter a character: ");
			ch = (char)br.read();
			
			//test and display the type of character
			System.out.print("You entered: ");
			if(Character.isDigit(ch))
				System.out.println("a digit.");
			else if(Character.isUpperCase(ch))
				System.out.println("an uppercase letter");
			else if(Character.isLowerCase(ch))
				System.out.println("a lowercase letter");
			else if(Character.isSpaceChar(ch))
				System.out.println("a spacebar character");
			else if(Character.isWhitespace(ch))
			{
				System.out.println("a whitespace charcter");
				return;
			}
			else 
				System.out.println("Sorry, I don't know that");
				br.skip(2); //to skip \n code from br
		}
	}
}