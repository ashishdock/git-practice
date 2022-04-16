// A bubble sort for strings
class BubbleSortString
{
	static String arr[] = { "Now", "is", "the", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"};
	
	public static void main(String args[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				//if(arr[j].compareTo(arr[i]) < 0)	// this takes into account Uppercase and Upper case has lower ASCII value so it will come first, use compareToIgnoreCase instead
				if(arr[j].compareToIgnoreCase(arr[i]) < 0)
				{
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[i]);
		}
	}
}