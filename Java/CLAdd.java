class CLAdd{
	public static void main(String args[]){
		if(args.length != 2){
			System.err.print("Please enter 2 numbers to add!");
			return;
		}
		
		String s1 = args[0];
		String s2 = args[1];
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double total = d1 + d2;
		
		System.out.println("The sum of the numbers is: " + total);
	}
}