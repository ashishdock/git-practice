class Binary7 {
	public static void main(String args[]){
		int num = 0b1010; 
		
		System.out.printf("\nIn Decimal = %d", num);
		System.out.printf("\nIn Octal = %o", num);
		System.out.printf("\nIn Hexadecimal = %x", num);
		System.out.printf("\nIn Binary = %s", Integer.toBinaryString(num));
	}
}