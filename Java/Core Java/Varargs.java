// Demo of Varargs method to find biggest number
class Varargs{
	/* This is varargs method. It can accept arbitrary number of arguments. */
	static int max(int ... x)
	{
		//take the first number in the array as biggest
		int max = x[0];
		//compare the biggest number with other numbers
		for(int i=1; i<x.length;i++)
		{
			if(max < x[i]) max = x[i];
		}
		return max;
	}
	
	public static void main(String args[])
	{
		//pass an array of 5 elements to varargs method
		int arr1[] = {20, 10, 5, 35, 40};
		int result = max(arr1);
		System.out.println("Maximum = " + result);
		//pass an array of 3 elements to varargs method
		int arr2[] = {1, 2, 3};
		result = max(arr2);
		System.out.println("Maximum = " + result);
		//pass 2 individual elements to varargs method
		result = max(10, 30);
		System.out.println("Maximum = " + result);
	}
}