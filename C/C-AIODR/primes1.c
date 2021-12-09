#include <stdio.h>

int main(){
	int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
	int *p;

	p = primes;
	
	printf("The fifth prime number is %d \n", *(p + 4));
	printf("and the seventh is %d.\n", *(p+6));	
	return(0);
}