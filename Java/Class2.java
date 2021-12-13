//calling main() method of Class1 from another class: Class2

class Class1{
	public static void main(){
		//args contains names, display them
		for(String s: args) //for-each loop
			System.out.println(s);
	}
}

class Class2{
	public static void main(){
		String names[] = {"Gopi", "Kamal", "Vinay", "Neeta Jain"};
		
		Class1.main(names);
	}
}