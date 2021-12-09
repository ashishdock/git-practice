#include <stdio.h>

int main(){
	float duration, days;
	float distance = 378921.46;
	float speed = 140;
	
	duration = distance / speed;
	days = duration / 24;

	printf("The moon is %f km away.\n", distance);
	printf("Travelling at %f kph, ", speed);
	printf("it would take %f hours to drive to the moon.\n", duration);
	printf("That's %f days.\n", days);
	return(0);
}