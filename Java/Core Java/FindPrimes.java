//Find prime numbers till the number user enters using method
import java.io.*;
import java.util.Arrays;

class FindPrimes{
	public static void main(String args[]){
		Primo one = new Primo(20);
		one.findPrimes(20);
	}
}

class Primo{
	int x;
	Primo(int z){
		x = z;
	}
	
	void findPrimes(int x){
		// primeCount = 0;
		// int primeArr[];
		// arrIndex=0; 
		System.out.println("x is " + x);
		int a;
		for(x; x>0;x--)	{
			for(int i=2; i<x;i++){
				a = x%i;
				if(a==0) break;
				if( i == x-1 && x%i != 0) System.out.println(x + " is prime number.");
			}		
		}	
	}	
}