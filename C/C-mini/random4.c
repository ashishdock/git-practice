#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int rnd(int range);
void seedrnd(void);

int main(){
	int x;
	seedrnd();
	printf("\t");
	for(x=0;x<3;x++)
		printf("%i\t", rnd(6));	
	return(0);
}

int rnd(int range){
	int r;
	r=rand()%range+1;
	return(r);
}

void seedrnd(){
	srand((unsigned)time(NULL));
}