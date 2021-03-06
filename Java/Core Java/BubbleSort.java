import java.io.*;

class BubbleSort{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many elments? ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int a=0; a<n-1; a++){
			for(int b=a+1; b<n; b++){
				if(arr[a] > arr[b]){
					int temp;
					System.out.printf("arr[%d] = %d and arr[%d] = %d\n", a, arr[a], b, arr[b]);
					temp = arr[b];
					System.out.printf("Temp = %d\n", temp);
					arr[b] = arr [a];
					System.out.printf("arr[%d] is now = %d\n", b, arr[b]);
					arr[a] = temp;
					System.out.printf("arr[%d] is now = %d\n", a, arr[a]);
					System.out.printf("Array is now:");
					for(int c=0;c<n;c++){
						System.out.printf("%d  ", arr[c]);
					}
					System.out.print("\n\n");
				}
			}
		}
		
		System.out.println("The numbers in ascending order are: ");
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}