#include <stdio.h>

int main(){
	int cent[8];
	int *c;
	int x;
	c=cent;

	putchar('\n');
	for(x=0;x<8;x++){
		*(c + x) = (x+1) * 100;
		printf("cent[%d] = %d\n", x, *(c + x));
	}
	return(0);
}