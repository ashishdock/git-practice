// A program to create  LocalDateTime class object and extract some data from that object using methods
//LocalDateTime class
//To display system date and time and get some data

import java.time.*;

class Prog3
{
	public static void main(String args[])
	{
		//get the current date and time
		LocalDateTime dt = LocalDateTime.now();
		System.out.printf("%nLocalDateTime object with current date and time: %n%s", dt);
		
		//create LocalDateTime object with date: 1994-4-15 and time: 11:30 am
		LocalDateTime dt1 = LocalDateTime.of(1994, Month.APRIL, 15, 11, 30);
		System.out.printf("%nLocalDateTime object with some date and time: %n%s", dt1);
		
		//find out the date and time 6 months from now
		System.out.printf("%n6 months from now: \n%s", dt.plusMonths(6));
		
		//find the date and time 6 months before now
		System.out.printf("\n6 months ago: \n%s", dt.minusMonths(6));
		
		//get the day of week for the current date and time
		DayOfWeek dw = dt.getDayOfWeek();
		
		//represent the day of week with its name
		String s = dw.name();
		System.out.printf("\nDay of Week name: \n%s", s);
		
		//represent day of week with integer value
		int n = dw.getValue();
		System.out.printf("\nDay of week integer value: \n%s", n);
	}
}