#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int rnd(void);
void seedrnd(void);


int main(){
	int x;
	seedrnd();
	puts("Behold! The 100 random numbers");
	printf("\t");
	for(x=0;x<100;x++)
		printf("%d\t", rnd());
	return(0);
}

int rnd(){
	int r;
	r=rand();
	return(r);
}

void seedrnd(){
	srand((unsigned)time(NULL));
}