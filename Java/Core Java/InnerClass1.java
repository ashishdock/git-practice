//inner class example
//this is the outer class

import java.io.*;

class BankAcct
{
	//balance amount is the variable
	private double bal;
	//initialize the balance
	BankAcct(double b)
	{
		bal = b;
	}
	
	//in this method, inner class object is created after verifying
	//the authentication of user. r is rate of interest
	//this method accepts rate of interest rate
	void contact(double r) throws IOException
	{
		//accept the password from keyboard and verify
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter password: ");
		String passwd = br.readLine();
		if(passwd.equals("xyz123"))
		{
			//if password is correct then calculate interest
			Interest in = new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.println("Sorry, you are not an authorized person!");
			return;
		}
	}
	
	//inner class
	private class Interest
	{
		//rate of interest
		private double rate;
		//initialize the rate
		Interest(double r)
		{
			rate = r;
		}
		//calculate interest amount and update balance
		void calculateInterest()
		{
			double interest = (bal * rate)/100;
			bal += interest;
			System.out.println("Updated Balance = " + bal);
		}
	}
}
//Using inner class 
class InnerClass1
{
	public static void main(String args[]) throws IOException
	{
		//bank account is holding a balance of 10000
		BankAcct account = new BankAcct(10000);
		//Update balance amount by adding interest at 9.5%
		account.contact(9.5);
	}
}