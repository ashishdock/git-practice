#include <stdio.h>
#define SPEED 11*5 /* the speed limit */
#define WINNER "Super"
#define CALCULATE 9*2*5

int main(){
	printf("Now, the speed limit here is %i.\n", SPEED);
	printf("But I clocked you doin' %i.\n", SPEED+15);
	printf("Didn't you see that %i MPH sign?\n", SPEED);
	printf("Winner is %s.\n", WINNER);
	printf("Calculation of 9*2*5 is %d.", CALCULATE);
	return(0);
}