//Compile the program using jdk 1.6 compiler or later version
//The warning message given by the java compiler is suppressed with the help of @SuppressWarnings annotation


import java.util.*;

class Sample16
{
	@SuppressWarnings
	public static void main(String args[])
	{
		Hashtable ht = new Hashtable();
		ht.put(10, "Lakshmi");
		ht.put(11, "Gopi Krishna");
	}
}