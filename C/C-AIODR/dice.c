#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	int d1, d2, total;
	
	srand((unsigned)time(NULL));

		d1 = (rand()%6) + 1;
		d2 = (rand()%6) + 1;
		printf("You rolled %d and %d: Total %d", d1, d2, d1 + d2);
	return(0);
}