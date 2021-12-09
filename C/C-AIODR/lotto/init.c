/* Init module */
#include "lotto.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void init(void){
/* Seed the randomizer */
	seedRandomizer();

/* display startup text */	
	puts("L O T T O   P I C K E R\n");
	puts("Press Enter to pick this week's numbers:");
	getchar();
}

void seedRandomizer(void){
	srand((unsigned)time(NULL));
}