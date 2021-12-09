#include <stdio.h>

int main(){
	char c;

	putchar('\t');	
	for(c=0;(unsigned)c<128;c++){

		printf("%d\t", c);
	}
	return(0);
}