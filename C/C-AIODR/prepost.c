#include <stdio.h>

int main(){
	int alpha, beta;
	
	alpha = 5;
	beta = alpha++;
	printf("Alpha = %d\n", alpha);
	printf("Beta = %d\n", beta);
	
	return(0);
}