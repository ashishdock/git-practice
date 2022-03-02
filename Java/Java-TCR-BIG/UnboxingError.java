// an error produced by manual unboxing
class UnboxingError
{
	public static void main(String args[])
	{
		Integer iOb = 1000;	// autobox the value of 1000
		int i = iOb.byteValue();	// manually unbox as byte !!!
		
		System.out.println(i);
	}
}