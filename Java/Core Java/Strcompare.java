//String Comparison
class Strcompare {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = new String ("Hello");
		String s3 = "Namaste";
		String s4 = "Namaste";
		
		if (s3 == s4)
			System.out.println("Both are same. (This results even after comparing with == operator which is incorrect for strings, because both are referencing the same object");
		else System.out.println("Not the same.");
		
		if (s1 == s2)
			System.out.println("They are the same.");
		else System.out.println("They are not same. (This result because this is not correct way to compare strings.");
		
		if (s1.equals(s2))
			System.out.println("They are the same.");
		else System.out.println("Not the same.");
	}
}