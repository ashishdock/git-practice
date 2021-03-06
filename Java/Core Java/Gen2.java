// A generic method = to read and display any type of array elements

class MyGenClass1
{
	//This method accepts T type array
	static <T>void display(T[] arr)
	{
		//use for-each loop and read elements of array
		for(T i:arr)
			System.out.println(i);
	}
}

class Gen2
{
	public static void main(String args[])
	{
		//read elements from Integer type array using display()
		Integer arr1[] = {1,2,3,4,5,6};
		System.out.println("Reading Integer objects: ");
		MyGenClass1.display(arr1);
		
		//read elements from Double type array using display();
		Double arr2[] = {1.1,2.2,3.3,4.4};
		System.out.println("Reading Double objects: ");
		MyGenClass1.display(arr2);
		
		//read elements from String type array using display()
		String arr3[] = {"Raju", "Rani", "Ravi", "Kiran"};
		System.out.println("Reading String objects: ");
		MyGenClass1.display(arr3);
	}
}