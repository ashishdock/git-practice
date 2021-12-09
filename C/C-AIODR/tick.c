#include <stdio.h>

int main(){
	int tick;
	
	printf("Variable tick is uninitialized.\n");
	for(tick=0;tick<10;tick=tick+1){
		printf("In the loop, tick = %d\n", tick);
		
	}
	printf("Out of the loop, tick = %d\n", tick);
	return(0);
}