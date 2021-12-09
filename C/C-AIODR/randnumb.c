#include <stdio.h>
#include <stdlib.h>

int main(){
	short int hat;

	hat = rand();   /*  alt: use random()  */
	printf("%d is a random number.\n", hat);
	return(0);
}