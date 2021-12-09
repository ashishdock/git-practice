#include <stdio.h>
#include <stdlib.h>

int rnd(void);

int main(){
	int x;
	
	puts("Behold! 100 Random Numbers!");
	printf("\t");
	for(x=0;x<100;x++)
		printf("%d\t",rnd());	
	printf("\nRAND_MAX is equal to %u\n", RAND_MAX);
	return(0);
}

int rnd(){
	int r;
	r=rand();
	return(r);
}