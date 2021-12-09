#include <stdio.h>

int main(){
	/* keep values small with short */
	short unsigned int a, b, u;
	short int s;

	a = 150;
	b = 300;
	u = a - b;
	s = a - b;

	printf("Unsigned variable u = %d\n", u);
	printf("Signed variable s = %d\n", s);
/* Using placehold for unsigned insead of declaring it as unsigned */

	int w, x, y, z;
	w = 150;
	x = 300;
	y = w - x;
	z = w - x;

	printf("\n\nUnsigned variable u =%u\n", y);
	printf("Signed variabole s = %d\n", z);
	return(0);
}