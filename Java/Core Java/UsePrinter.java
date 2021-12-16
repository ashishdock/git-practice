//An interface Printer to send text to any printer
import java.io.*;
//creating an interface for printing
interface Printer 
{
	//to print the text sent to printer
	void printit(String text); //public abstract
	//to disconnect from printer
	void disconnect();
}

//implementing Printer interface for IBM printer
class IBMPrinter implements Printer 
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed.");
		System.out.println("Disconnected from IBM printer!");
	}
}

//implementing Printer interface for Epson printer
class EpsonPrinter implements Printer 
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed.");
		System.out.println("Disconnected from Epson printer!");
	}
}

//Using a printer
class UsePrinter
{
	public static void main(String args[]) throws Exception
	{
		//attach FileReader to config.txt file to read data from it
		FileReader fr = new FileReader("config.txt");
		//connect LineNumberReader to FileReader to read one line at a time
		LineNumberReader lnr = new LineNumberReader(fr);
		//read the first line from the config.txt file
		String printername = lnr.readLine();
		//The readLine represents the printer name
		System.out.println("Loading the driver for: " + printername);
		//store the printername in an object c
		Class c = Class.forName(printername);
		//create an object to that class represented by printername in c
		Printer ref = (Printer)c.newInstance();
		//send text to printit using Printer reference
		ref.printit("Hello, This is printed on the printer");
		//disconnect after printing
		ref.disconnect();
	}
}