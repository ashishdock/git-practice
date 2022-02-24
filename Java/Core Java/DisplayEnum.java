//create an enumeration with day names
enum Days
{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

class DisplayEnum
{
	public static void main(String args[])
	{
		//using values() method retrieve all enum constants into alldays[] array
		Days alldays[] = Days.values();
		
		//using a for each loop, retrieve the enum constants from alldays[] and display them
		for(Days d: alldays)
			System.out.println(d);
	}
}