#include <stdio.h>

int main(){
	char c;
	short int i;
	long x;
	float f;
	double d;
	char temp[8];

	puts("\n\n\tMemory locations:");
	printf("Memory location of character c = %p\n", &c);
	printf("Memory location of int variable i = %p\n", &i);
	printf("Memory location of long variable x = %p\n", &x);
	printf("Memory location of float variable f = %p\n", &f);
	printf("Memory location of double variable d = %p\n", &d);
	printf("Memory location of array temp = %p\n\n", &temp[0]);

	puts("Variable sizes: ");
	printf("Size of char variable c = %d\n", sizeof(c));
	printf("Size of int variable i = %d\n", sizeof(i));
	printf("Size of long variable x = %d\n", sizeof(x));
	printf("Size of float variable f = %d\n", sizeof(f));
	printf("Size of double variable d = %d\n", sizeof(d));
	printf("Size of array temp is = %d\n\n\n", sizeof(temp));
/* NOTE: "sizeof" is a keywork hence an operator and not a function as it seems to be */

	printf("char variable c = %c\n", c);
	printf("int variable i = %d\n", i);
	printf("long variable x = %l\n", x);
	printf("float variable f = %f\n", f);
	printf("double variable d = %f\n", d);
	return(0);
}