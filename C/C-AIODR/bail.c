#include <stdio.h>
#include <stdlib.h>

void finish(void);

int main(){
	atexit(finish);
	
	puts("Press Enter to begin shutting down this program");
	getchar();	
	return(0);
}

void finish(void){
	puts("This is the function that looks under");
	puts("the hard drive for any missing bits...");
	
}