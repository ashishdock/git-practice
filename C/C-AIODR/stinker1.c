#include <stdio.h>

int main(){
	char string[] = "Is it supposed to smell that way?";
	char *s;
		
/* initialize variables */	
	s = string;
	
	while(putchar(*s++)); /* NULL character ends the string */

	return(0);
}