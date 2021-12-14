import java.io.*;

class Arr2{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many subjects? ");
		int n = Integer.parseInt(br.readLine());
		
		int marks[] = new int[n];
		int total = 0;
		for(int i=0; i<n; i++) {
			System.out.printf("Enter marks in subject [%d]: ", i+1);
			marks[i] = Integer.parseInt(br.readLine());
			total += marks[i];
		}
		
		System.out.println("Total marks = " + total);
		
		
	}
}