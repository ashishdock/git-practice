#include <stdio.h>
#include<stdlib.h>

int main(){
	long int hat;
	int loop;
	long int seed;

	printf("Enter a seed number: ");
	scanf("%d", &seed);
	srand(seed);
	putchar('\t');
	for(loop=0;loop<100;loop++){
		hat = rand();
		printf("%10d\t", hat);
	}
	
	return(0);
}