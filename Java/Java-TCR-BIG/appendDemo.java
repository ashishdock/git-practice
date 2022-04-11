// Demonstrate append()
class appendDemo
{
	public static void main(String args[])
	{
		String s;
		int a = 42;
		StringBuffer sb = new StringBufffer(40);
		
		s = sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
	}
}