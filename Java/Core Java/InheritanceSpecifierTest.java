//private and protected
class Access
{
	private int a;
	protected int b;
}

class SubAccess extends Access
{
	public void get()
	{
		//System.out.println(a);  //error - a is private
		System.out.println(b);
	}
}

class InheritanceSpecifierTest
{
	public static void main(String args[])
	{
		SubAccess s = new SubAccess();
		s.get();
	}
}