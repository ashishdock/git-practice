#include <stdio.h>

int main(){
	float rootbeer;
	float *pr;
	
	pr = &rootbeer;
	printf("The address of a variable rootbeer is %p.\n", pr);
	printf("The next float in memory will be at %p.\n", ++pr);
	
	return(0);
}