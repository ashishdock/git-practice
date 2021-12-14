class Prime1{
	public static void main(String args[]) {
		int x;
		int a;
		for(x = 10; x>0;x--)	{
			for(int i=2; i<x;i++){
				a = x%i;
				//System.out.println("Checking for " + x + " with " + i + "Value of remainder is " + a);
				if(a==0) break;
				if( i == x-1 && x%i != 0) System.out.println(x + " is prime number.");
			}
		}
	}
}