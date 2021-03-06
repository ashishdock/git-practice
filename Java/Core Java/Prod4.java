// A program to know the current time zone and find the date and time at the current location and at Los Angeles
//ZoneId and ZoneDateTime classes
//To know the time zone of our country

import java.time.*;

class Prod4
{
	public static void main(String args[])
	{
		//get the default timezone.
		ZoneId zone = ZoneId.systemDefault();
		System.out.printf("\nCurrent Time Zone = %s", zone);
		
		//get the date and time in the default time zone
		LocalDateTime dt = LocalDateTime.now();
		System.out.printf("\nDate and Time in India: %s", dt);
		
		//get the zone identification for Los Angeles
		ZoneId la = ZoneId.of("America/Los_Angeles");
		
		//get the date and time in Los Angeles
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.printf("\nDate and Time in Los Angeles: %s", zdt);
	}
}