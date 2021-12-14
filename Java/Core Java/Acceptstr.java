import java.io.*;

class Acceptstr {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a name: ");
		String name = (String)br.readLine();
		
		System.out.println("You entered name: " + name);
	}
}