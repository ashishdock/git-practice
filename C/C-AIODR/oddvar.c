#include <stdio.h>

typedef char byte;
typedef int word;

word main(){
	byte a;
	
	for(a=65;a<=90;a++)
		putchar(a);
	putchar('\n');
	return(0);
}