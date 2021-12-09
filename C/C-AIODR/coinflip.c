#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TOSS 1000

int main(){
	int coin, loop, heads, tails;
	heads = 0;
	tails = 0;

	srand((unsigned)time(NULL));

	for(loop=0;loop<TOSS;loop++){
		coin = (rand()%2) + 1;
		if (coin == 1) heads++;
		else if (coin == 2) tails++;
	}
	printf ("Out of 1000 coin tosses, Tails came up %d times and Heads came up %d times", tails, heads);
	return(0);
}