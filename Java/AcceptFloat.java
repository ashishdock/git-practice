import java.io.*;

class AcceptFloat{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a floating point number: ");
		String st = br.readLine();
		
		Float f = Float.parseFloat(st);
		System.out.printf("\nYou entered floating point number: " + f);
	}
	
}