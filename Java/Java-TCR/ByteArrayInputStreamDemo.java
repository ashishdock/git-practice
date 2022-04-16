// Demonstrate ByteArrayInputStream
import java.io.*;

class ByteArrayInputStreamDemo
{
	public static void main(String args[])
	{
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte b[] = tmp.getBytes();
		
		ByteArrayInputStream input1 = new ByteArrayInputStream(b);
		ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
		
		for(int i=0; i<3; i++)
		{
			int c = input2.read();
			System.out.println((char)c);
		}
	}
}