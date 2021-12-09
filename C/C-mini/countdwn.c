/* An important program for NASA to properly launch America's spacecraft. */

#include <stdio.h>
#include <unistd.h>

int main(){
	int start;
	unsigned long delay;

	do{
		printf("Please enter the number to start\n");
		printf("the countdown (1 to 100):");
		scanf("%d", &start);
	} while(start<1 || start >100);

/* The countdown loop */	

	do{
		printf("T-minus %d\n", start);
		start--;
		sleep(1);
/*		for(delay=0;delay<4000000;delay++);*/
	}
	while(start>0);

	printf("Zero!\nBlast off!\n");
	return(0);
}