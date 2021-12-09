#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ROLLS 1000.00

int main(){
	int d1, d2, total, loop;
	float average;
	
	total = 0;
	srand((unsigned)time(NULL));
		
		for(int loop = 0;loop<ROLLS;loop++){
			d1 = (rand()%6) + 1;
			d2 = (rand()%6) + 1;
			total = total + d1 + d2;
		}
	average = (float)total / ROLLS;
	printf("The total of the 1000 dice rolls is %d\n", total);
	printf("The average roll from the 1000 rolls of dice is: %f \n", average);
	return(0);
}