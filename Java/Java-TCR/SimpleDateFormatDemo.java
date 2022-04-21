// Demonstrate SimpleDateFormat
import java.util.*;
import java.text.*;

public class SimpleDateFormatDemo
{
	public static void main(String args[])
	{
		Date date = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("dd MM yyyy hh:mm:ss zzz");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("E MMM dd yyyy");
		System.out.println(sdf.format(date));
	}
}