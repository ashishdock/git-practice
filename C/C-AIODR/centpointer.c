#include <stdio.h>

int main(){
	int cent[8];
	int *c;
	int x;
	c=cent;

	for(x=0;x<8;x++){
		*c = (x+1) * 100;
		printf("cent[%d] = %d\n", x, *c++);
	}
	putchar('\n');

	for(x=0;x<8;x++){
		*c = (x+1) * 100;
		printf("cent[%d] = %d\n", x, ++*c);
	}
	return(0);
}