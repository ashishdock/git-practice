#include <stdio.h>

#define ROLL 32000
#define SPACES 1

int main(){
	short int dice;
	long int money = 0;
	
	puts("\tMonopoly Money Calculator");
	for(dice=0;dice<ROLL;dice+=SPACES){
		money += 200;
		printf("Roll %d\r", dice);  /* display on one line */
	}
	putchar('\n');
	printf("You made a total of %d!\n", money);
	return(0);
}