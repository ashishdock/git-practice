//User defined exception
//to throw whenver balance amount is below Rs 1000

class MyException extends Exception
{
	//store account information
	private static int accno[] = {1001, 1002, 1003, 1004, 1005};
	
	private static String name[] = {"Raja Rao", "Rama Rao", "Subha Rao", "Appa Rao", "Laxmi Devi"};
	
	private static double bal[] = {10000.00, 12000.00, 5600.50, 999.00, 1100.55};
	
	//default constructor
	MyException(String str)
	{
		super(str);
	}
	
	//write main()
	public static void main(String args[])
	{
		try
		{
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			
			//display actual account information
			for(int i=0; i<5; i++)
			{
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				
				//display own exception if balance < 1000
				if(bal[i]<1000)
				{
					MyException me = new MyException("Balance amount is less!");
					throw me;
				}
			}	
			System.out.println("");
		}
		catch(MyException me)
		{
			me.printStackTrace();
		}
	}
}