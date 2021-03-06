//Display syatem date and time using Date class

import java.util.*;
import java.text.*;

class MyDateObj1
{
	public static void main(String args[])
	{
		//Create Date class object - this contains system date and time
		Date d = new Date();
		
		//Format the date to medium format and time to short format
		DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, Locale.UK);
		
		//Apply the baove format to the Date object
		String str = fmt.format(d);
		
		//Now display the formatted date and time
		System.out.println(str);
	}
}