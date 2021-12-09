#include <stdio.h>

int main(){
	char string[] = "Is it supposed to smell that way?";
	char ch;
	int x;
	
/* initialize variables */	
	ch = 'a';
	x = 0;
	
	while(ch!='\0'){ /* NULL character ends the string */
		ch = string[x];
		putchar(ch);
		x++;
	}
	return(0);
}