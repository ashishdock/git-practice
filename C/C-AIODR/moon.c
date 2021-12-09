#include <stdio.h>

int main(){
	float duration, distance, speed;
	distance = 378921.46;
	speed = 140;
	
	duration = distance/speed;
	
	printf("The moon is %f km away.\n", distance);
	printf("Traveling at %f kph, ", speed);
	printf("it would take %f hours to drive to the moon. \n", duration);
	return(0);
}