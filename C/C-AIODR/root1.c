#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(){
	float value;
	double root;

	printf("Enter a value: ");
	scanf("%f", &value);
	value = fabs(value);
	root = sqrt((double)value);
	printf("The square root of %f is %f.\n", value, root);
	return(0);
}