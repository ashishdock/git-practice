//Loops may be nested

class Nested3
{
	public static void main(String args[])
	{
		int i, j, k;
		
		for(i=1; i<=10; i++)
		{
			for(j=i; j<10; j++)
				System.out.print(" ");
			for(k=10-i; k<10; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}