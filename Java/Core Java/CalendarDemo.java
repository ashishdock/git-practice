//to display System date and time

import java.util.*;

class CalendarDemo
{
	public static void main(String args[])
	{
		//create calendar class object, By default it contains  the system date and time
		Calendar c1 = Calendar.getInstance();
		
		//display date separately
		System.out.print("Current date: ");
		int dd = c1.get(Calendar.DATE);
		int mm = c1.get(Calendar.MONTH);
		++mm;
		int yy = c1.get(Calendar.YEAR);
		System.out.println(dd + "-" + mm + "-" + yy);
		
		//display time alone
		System.out.print("Current time: ");
		int h = c1.get(Calendar.HOUR);
		int m = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		System.out.println(h + "-" + m + "-" + s);
		
		int x = c1.get(Calendar.AM_PM);
		if(x==0) System.out.println("\tGood Morning!");
		else System.out.println("\tGood Evening!");
	}
}