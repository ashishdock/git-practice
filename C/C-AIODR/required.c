#include <stdio.h>

int main(int argc, char *argv[]){

/* check for proper number of arguments */	
	if(argc == 1){
		puts("This program requires you to type");
		puts("some text after the program name.");
		return(1);
	}
/* Program continues here */
	printf("I shall now work on the \"%s\" option.\n", argv[1]);
	return(0);
}