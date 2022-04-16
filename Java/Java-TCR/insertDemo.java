// Demonstrate insert().
class insertDemo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("abcdef");
		
		sb.insert(2, "like ");
		System.out.println(sb);
	}
}