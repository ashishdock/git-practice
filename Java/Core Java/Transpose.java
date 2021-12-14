import java.io.*;
import java.util.Scanner;

class Transpose {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows, columns? ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		System.out.println("Enter the elements of the matrix: ");
		for (int a=0; a<r; a++){
			for(int b=0; b<c; b++){
				arr[a][b] = sc.nextInt();
			}
		}
		
		for (int a=0; a<r; a++){
			for (int b=0; b<c; b++){
				System.out.printf("%d ", arr[a][b]);
			}
			System.out.println();
		}
		
		System.out.println("Now Transposing the matrix");
		
		for(int a=0; a<c; a++){
			for(int b=0; b<r; b++){
				System.out.printf("%d ", arr[b][a]);
			}
			System.out.println();
		}
	}
}