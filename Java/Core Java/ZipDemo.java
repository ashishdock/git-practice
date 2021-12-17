// Compressing a file using a DeflaterOutputStream

import java.io.*;
import java.util.zip.*;

class ZipDemo
{
	public static void main(String args[]) throws Exception
	{
		//attach the original file: file1 to FileInputStream for reading data
		FileInputStream fis = new FileInputStream("myfile1.txt");
		
		//attach compressed file: file2 to FileOutputStream 
		FileOutputStream fos = new FileOutputStream("file2");
		
		//attach FileOutputStream to DeflaterOutputStream 
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		
		//read data from FileInputStream and write it into DeflaterOutputStream
		int data;
		while((data = fis.read()) != -1)
			dos.write(data);
		
		//close the files
		fis.close();
		dos.close();
		
	}
}