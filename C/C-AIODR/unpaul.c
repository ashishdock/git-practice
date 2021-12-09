#include <stdio.h>

#define CENT_PER_INCH 2.54

int main(){
	union measure{
		float centimeters;
		int inches;
	};
	union measure you;
	union measure paul;
	
	paul.inches = 70;

	printf("Paul is %d inches tall.\n", paul.inches);
	printf("How tall are you in inches? ");
	scanf("%d",&you.inches);
	
	you.centimeters = CENT_PER_INCH * (float)you.inches;
	paul.centimeters = CENT_PER_INCH * (float)paul.inches;

	printf("You are %f.1 centimeters tall.\n", you.centimeters);
	printf("Paul is %f.1 centimeters tall.\n", paul.centimeters);

/* Value in inches is lost now as unions only hold ONE of the values NOT BOTH */
	printf("Paul is %d inches tall.\n", paul.inches);
	printf("You are %d inches tall.\n", you.inches);

	return(0);
}