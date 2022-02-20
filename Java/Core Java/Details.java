//connecting to www.yahoo.com and getting the details

import java.io.*;
import java.net.*;
import java.util.*;

class Details
{
	public static void main(String args[]) throws Exception
	{
		//pass the site url to URL object
		URL obj = new URL("https://in.yahoo.com");
		//open a connection with the site on Internet
		URLConnection conn = obj.openConnection();
		//display the date
		System.out.println("Date: " + new Date(conn.getDate()));
		//display the content type whether text or html
		System.out.println("Content type: " + conn.getContentType());
		//display expiry date
		System.out.println("Expiry: " + conn.getExpiration());
		//display last modified date
		System.out.println("Last Modified: " + new Date(conn.getLastModified()));
		//display how many bytes the index.html page has
		int l = conn.getContentLength();
		System.out.println("Length of Content: " + l);
		if(l==0)
		{
			System.out.println("Content not available.");
			return;
		}
		else
		{
			int ch;
			InputStream in = conn.getInputStream();
			//display the content of the index.html page
			while((ch=in.read()) != -1)
				System.out.print((char)ch);
		}
	}
}