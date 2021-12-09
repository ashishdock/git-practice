#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
	float value;
	double answer;
	
	printf("0! Computer, find me the square root of: \n");
	scanf("%f", &value);

	if(value < 0.0) abort();

	answer = sqrt((double)value);
	printf("The computer says the answer is %f\n", answer);
	return(0);
}