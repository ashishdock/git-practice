#include <stdio.h>

int main(){
	int a, b, c, d, e, x;
	int *variables[5];

	a = 1;
	b = a * 2;
	c = b * 2;
	d = c * 2;
	e = d * 2;

	variables[0] = &a;
	variables[1] = &b;
	variables[2] = &c;
	variables[3] = &d;
	variables[4] = &e;

	for(x=0;x<5;x++)
		printf("Variable %c = %d\n", 'a'+x, *variables[x]);
	return(0);
}