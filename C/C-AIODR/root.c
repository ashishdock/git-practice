#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(){
	int value;
	double root;

	puts("Enter a value to calculate the square root: ");
	scanf("%d", &value);
	value = abs(value);
	root = sqrt((double)value);
	printf("The square root of %d is %f\n", value, root);
	return(0);
}