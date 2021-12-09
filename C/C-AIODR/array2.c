#include <stdio.h>

void showArray(int *array, int size);
void modArray(int *array, int size);

int main(){
	int primes[] = { 2, 3, 5, 7, 11, 13 };
	int size = sizeof(primes) / sizeof(primes[0]);
	
	puts("\nOriginal Array");
	showArray(primes, size);
	modArray(primes, size);
	puts("\nModified Array");
	showArray(primes, size);
	return(0);
}

void showArray(int *array, int size){
	int x;
	for(x=0;x<size;x++)
		printf("Element %d: %d\n", x, *(array + x));	
}

void modArray(int *array, int size){
	int x = 0;
	for(x;x<size;x++)
		*(array+x) *= 2;
}