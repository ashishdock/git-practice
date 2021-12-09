#include <stdio.h>

void showArray(int *array);

int main(){
	int primes[] = { 2, 3, 5, 7, 11, 13 };

	showArray(primes);
	return(0);
}

void showArray(int *array){
	int x;
	
	for(x=0;x<6;x++)
		printf("Element %d: %d\n", x, array[x]);
}