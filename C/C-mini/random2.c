#include <stdio.h>
#include <stdlib.h>

int rnd(void);
void seedrnd(void);

int main(){
	int x;
	
	seedrnd();
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

void seedrnd(void){
	int seed;
	char s[6];
	
	printf("Enter a random number between 2 to 65000:");
	seed=(unsigned)atoi(gets(s));
	srand(seed);
}