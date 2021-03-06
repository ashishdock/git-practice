interface MyInter
{
	void connect(); //abstract public
	void disconnect();
}

class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Oracle database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnecting from Oracle database...");
	}
}

class SybaseDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Sybase database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnecting from Sybase database...");
	}
}

class InterfaceDemo
{
	public static void main(String args[]) throws Exception
	{
		//accept the implementation classname from Commandline argument and store it in the object c.
		Class c = Class.forName(args[0]);
		
		//create an object to the class whose name is in c
		//let the reference variable of interface point to it
		MyInter mi = (MyInter)c.newInstance();
		
		//call methods of the object using mi.
		mi.connect();
		mi.disconnect();
	}
}