//This is implementation class of MyDate interface
package mypack; //store DateImpl class also in mypack
import mypack.MyDate;
import java.util.*;

public class DateImpl implements MyDate
{
	public void showDate()
	{
		//Date class object by default stores system date and time
		Date d = new Date();
		System.out.println(d);
	}
}