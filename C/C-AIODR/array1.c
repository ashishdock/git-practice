#include <stdio.h>

void showArray(int *array, int size);

int main(){
	int primes[] = { 2, 3, 5, 7, 11, 13 };
	int size;
	size = sizeof(primes)/sizeof(primes[0]);	

	showArray(primes, size);
	return(0);
}

void showArray(int *array, int size){
	int x;
	for(x=0;x<size;x++)
		printf("Element %d: %d\n", x, *(array +x));
}