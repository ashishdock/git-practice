//URL

import java.net.*;

class MyURL
{
	public static void main(String args[]) throws Exception
	{
		URL obj = new URL("http://dreamtechpress.com/index.html");
		System.out.println("Protocol: " + obj.getProtocol());
		System.out.println("Host: " + obj.getHost());
		System.out.println("File: " + obj.getFile());
		System.out.println("Port: " + obj.getPort());
		System.out.println("Path: " + obj.getPath());
		System.out.println("External form: " + obj.toExternalForm());
	}
}