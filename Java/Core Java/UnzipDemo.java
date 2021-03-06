//Uncompressing a file using InflaterInputStream

import java.io.*;
import java.util.zip.*;

class UnzipDemo
{
	public static void main(String args[]) throws Exception
	{
		//attach input file: file2 to FileInputStream for reading data
		FileInputStream fis = new FileInputStream("file2");
		
		//attach output file: file3 to FileOutputStream for writing data into it
		FileOutputStream fos = new FileOutputStream("file3");
		
		//attach InflaterInputStream to FileInputStream for uncompressing the data
		InflaterInputStream iis = new InflaterInputStream(fis);
		
		//read data from InflaterInputStream and write it into FileOutputStream
		int data;
		while((data = iis.read()) != -1)
			fos.write(data);
		
		//close the files
		fos.close();
		fis.close();
	}
}