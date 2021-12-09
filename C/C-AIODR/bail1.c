#include <stdio.h>
#include <stdlib.h>

void finish(void);
void spiffy(void);
void animation(void);

int main(){
	atexit(animation);
	atexit(spiffy);
	atexit(finish);
	
	puts("Press Enter to begin shutting down this program");
	getchar();	
	return(0);
}

void finish(void){
	puts("This is the function that looks under");
	puts("the hard drive for any missing bits...");
	
}

void spiffy(void){
	puts("This function cleans up the keyboard.");
}

void animation(void){
	puts("As a final trick, the Taco Bell dog will dance");
	puts("across your monitor with this function.\a");
}