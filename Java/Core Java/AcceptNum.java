import java.io.*;
class AcceptNum {
	public static void main(String args[]) throws IOException{
		System.out.print("Enter an integer: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int x = Integer.parseInt(st);
		
		System.out.println("You entered the integer: " + x);
	}
}