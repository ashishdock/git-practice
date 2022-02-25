// A program to find the number of days between your birthday and today
//Period class

import java.time.*;

class Prod5
{
	public static void main(String args[])
	{
		//get today's date
		LocalDate today = LocalDate.now();
		
		//create LocalDate object with your birth date
		LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
		
		//find the number of days between using Period class between()
		Period p = Period.between(birthday, today);
		System.out.printf("You are %d years %d months and %d days older", p.getYears(), p.getMonths(), p.getDays());
	}
}