/* Select module */
#include "lotto.h"
#include <stdio.h>
#include <stdlib.h>

extern int ball[BALLS];  /*  Global array  */

void select(void){
	int numbers[RANGE];
	int c, b;

/* initialize the tracking array */
	for(c=0;c<RANGE;c++)
		numbers[c]=0;

/* draw the numbers */
	puts("Here they come:");
	for(c=0;c<BALLS;c++){
		do{
			b = rand() % RANGE;
		}
		while(numbers[b]);
					/* number drawn */
		numbers[b] = 1;
		ball[c] = b + 1;
	}
}