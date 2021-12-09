#include <stdio.h>

#define RAD 57.2957795

int main(){
	float radians, degrees;

	printf("Convert Radians to Degrees");
	printf("Enter a value in Radians: ");
	scanf("%f", &radians);

	degrees = radians * RAD;

	printf("%0.5f Radians is %0.3f degrees.\n", radians, degrees);
	return(0);
}