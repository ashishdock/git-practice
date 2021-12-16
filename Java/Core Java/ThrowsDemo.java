//Not handling the exception
import java.io.*;

class Samp
{
	//instance variable
	private String name;
	//method to accept name
	void accept() throws IOException
	{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		name = br.readLine();
	}
	
	void display()
	{
		System.out.println("Name: " + name);
	}
}

class ThrowsDemo
{
	public static void main(String []args) throws IOException
	{
		Samp s = new Samp();
		s.accept();
		s.display();
	}
}