// A program to test whether a given year is leap year or not
// Year class
//To know whether a year is leap or not

import java.time.*;

class Prog6
{
	public static void main(String args[])
	{
		//take the year
		int n = 2015;
		
		//create Year class object with that year
		Year y = Year.of(n);
		
		//test if y is leap year or not using isLeap()
		boolean flag = y.isLeap(); //flag is true if leap
		
		if (flag) System.out.printf("\nYear %d is leap", n);
		else System.out.printf("\nYear %d is not a leap year.", n);
	}
}