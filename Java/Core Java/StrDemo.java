class StrDemo {
	public static void main(String args[]){
		String s1 = "A book on Java";
		String s2 = new String ("I like it") ;
		char arr[] = {'D', 'r', 'e', 'a', 'm', 't', 'e', 'c', 'h', ' ', 'P', 'r', 'e', 's', 's'};
		String s3 = new String(arr);
		
		// display all the 3 strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//find the length of first string
		System.out.println("The length of string s1 is: " + s1.length());
		
		//concatenate two strings
		System.out.println("Concatenation of s1 and s2 is: " + s1.concat(s2));
		
		// concatenate 3 strings
		System.out.println("Concatenation of s1, s2 and s3: " + s1.concat(s2.concat(s3)));
		
		// concatenate 3 strings with +
		System.out.println(s1 + "from" + s2);
		
		//test if string s1 starts with A
		boolean x = s1.startsWith("A");
		if(x) System.out.println("s1 starts with 'A'");
		else System.out.println("s1 does not start with 'A'");
		
		//extract substring from s2, starting from 0th char to 6th char
		String p = s2.substring(0, 7);
		
		//extract substring from s3, starting from 0th char to 8th char
		String q = s3.substring(0, 9);
		
		//concatenate the strings p and q
		System.out.println(p+q);
		
		//convert s1 into uppercase and lowercase
		System.out.println("s1 in UPPER CASE: " + s1.toUpperCase());
		System.out.println("s1 in lower case: " + s1.toLowerCase());
	}
}