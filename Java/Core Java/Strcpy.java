// copying a string into an array

class Strcpy {
	public static void main(String args[]){
		String str = "Hello, this is a book on Java";
		char arr[] = new char[20];
		
		//copy from str into arr starting from 7th character to 20th character
		str.getChars(7, 21, arr, 0);
		
		System.out.println(arr);
	}
}