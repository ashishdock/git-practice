import java.io.*;

class EmpData {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Emp ID: ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Gender (M/F): ");
		char g = (char)br.read();
		// Solution1: char g = br.readLine.charAt(0);
		// Solution2:  skip 2 characters
		br.skip(2);
		
		System.out.print("Enter Name: ");
		String name = (String)br.readLine();
		
		System.out.println("ID = " + id);
		System.out.println("Gender = " + g);
		System.out.println("Name = " + name);
	}
}