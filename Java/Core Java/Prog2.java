// A program to retrieve the date and time in parts separately
//LocalDate and LocalTime classes
//To retrieve date and time in parts

import java.time.*;

class Prog2
{
	public static void main(String args[])
	{
		//current date is returned by LocalDate.now()
		LocalDate date = LocalDate.now();
		
		//get the date, month, year from date
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.printf("\n%d-%d-%d", dd, mm, yy);
		
		//current time is given by LocalTime.now();
		LocalTime time = LocalTime.now();
		
		//get the hour, minute, second, nano seconds from time
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("\n%d:%d:%d:%d", h, m, s, n);
	}
}