#include <stdio.h>
#include <time.h>

#define DELAY 0.1

void pause(void){
	time_t then;
	time(&then);
	while(difftime(time(NULL),then) < DELAY);
}

int main(){
	int x;

	for(x=10;x>0;x--){
	printf("%d\n", x);
	pause();
	}		
	printf("Blast off!");
	return(0);
}