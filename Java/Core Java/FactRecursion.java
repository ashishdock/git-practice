//Factorial without recursion
class FactRecursion {
	static long factorial (int num) {
		long fact;
		if (num == 1)
			return 1;
		fact = num * factorial(num-1);
		return fact;
	}
	
	public static void main(String args[]){
		System.out.println("Factorial of 5 is " + factorial(5));
	}
}