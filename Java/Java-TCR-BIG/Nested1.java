//Loops may be nested

class Nested1
{
	public static void main(String args[])
	{
		int i, j, k;
		
		
			for(j=0; j<10; j++)
			{
				for(k=10-j; k<=10; k++)
					System.out.print("*");
				System.out.println();
			}
	}
}