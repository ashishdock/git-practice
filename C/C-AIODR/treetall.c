#include <stdio.h>
#include <math.h>

#define RAD 57.2957795

int main(){
	double opposite, angle;
	float degrees, adjacent;
	
	puts("\tLet's calculate - How tall is that tree? ");
	printf("How far away is the tree in feet? ");
	scanf("%f", &adjacent);
	printf("What angle is it to the tree top in degrees? ");
	scanf("%f", &degrees);
	
/* Convert degrees to raidans */	
	angle = (double)degrees/RAD;

/* Get the tree height */
	
	opposite = tan(angle) * (double)adjacent;

	printf("That tree is %.2f feet tall.\n", opposite);
	return(0);
}