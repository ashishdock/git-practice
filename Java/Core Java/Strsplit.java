//Splitting a string

class Strsplit {
	public static void main(String args[]){
		//take a string str which is to be broken
		String str = "Hello, this is a book on Java";
		
		//declare a string type array s to store pieces
		String s[];
		
		//split the string where a space is found in str
		s = str.split(" ");
		
		System.out.println(s);
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}
}
