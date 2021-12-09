#include <stdio.h>

#define KPM 1.609344

int main(){
	float kilometers, miles;
	float *pmiles;

	printf("Enter a value in miles:");
	scanf("%f", &miles);
	
	kilometers = miles*KPM;
	
	printf("%0.2f miles work out to be %0.2f kilometers.\n", miles, kilometers);	

	pmiles = &miles;
	printf("Variable 'miles' is %d bytes long at %p address\n", sizeof(miles), pmiles);
	return(0);
}