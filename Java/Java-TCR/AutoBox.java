//Demonstrate autoboxing / auto-unboxing
class AutoBox
{
	public static void main(String args[])
	{
		Integer iOb = 100;	//autobox an int
		int i = iOb;		//auto-unbox and integer object
		System.out.println(i + " " + iOb);
	}
}