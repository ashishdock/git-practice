#include <stdio.h>

#define DISTANCE 378921.46   /* in kilometers */
#define PI 3.141

int main(){
	double orbit;
	
	orbit = DISTANCE * 2 * PI;
	printf("The moon travels %f km in one orbit.\n", orbit);
	
	return(0);
}