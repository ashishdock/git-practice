#include <stdio.h>

int main(){
	int teeny;
	int *t;

/* initialize variables */
	teeny = 1;
	t = &teeny;

/* use and abuse variables */
	printf("Variable teeny = %d\n", teeny);
	printf("Variable t = %p\n", t);
	printf("Variable *t = %d\n", *t);

	*t = 64;
	printf("Variable teeny = %d\n", teeny);
	printf("Variable t = %p\n", t);
	printf("Variable *t = %d\n", *t);
	return(0);
}