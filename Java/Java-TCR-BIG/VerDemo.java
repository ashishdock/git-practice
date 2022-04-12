// Demonstrate Runtime.Version release counters

class VerDemo
{
	public static void main(String args[])
	{
		Runtime.Version ver = Runtime.version();
		
		// Display individual counters.
		System.out.println("Feature realease counter: " + ver.feature());
		System.out.println("Interim release counter: " + ver.interim());
		System.out.println("Update release counter: " + ver.update());
		System.out.println("Patch release counter: " + ver.patch());
	}
}