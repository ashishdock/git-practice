// A program to display System date and time
//Using LocalDate and LocalTime class

import java.time.*;

class Prog1
{
	public static void main(String args[])
	{
		//LocalDate.now() gives system date into LocalDate obj
		LocalDate today = LocalDate.now();
		
		//LocalTime.now() gives system time into LocalTime obj
		LocalTime time = LocalTime.now();
		
		System.out.println(today);
		System.out.println(time);
	}
}