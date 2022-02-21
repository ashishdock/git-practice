// A client that receives the messages from the server above

import java.io.*;
import java.net.*;

class MultiClient
{
	public static void main(String args[]) throws Exception
	{
		//create Client socket with port number 999
		Socket s = new Socket("localhost", 999);
		
		//to accept data from server
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//receive data as long as server does not close client socket
		String str;
		while((str = br.readLine()) != null)
			System.out.println(str);
		
		//close the connection
		br.close();
		s.close();
	}
}