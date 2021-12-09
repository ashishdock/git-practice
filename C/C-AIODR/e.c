#include <stdio.h>
#include <math.h>

int main(){
	double ln, x;

	for(x=0.1;x<6.0;x+=0.1){
		ln = log(x);
		printf("log of %f is ln(%3.1f) = %f\n", x, x, ln);
	}
	return(0);
}