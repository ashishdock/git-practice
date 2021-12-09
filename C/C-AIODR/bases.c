#include <stdio.h>

#define PODS 50
#define LOCATIONS 0xBA3C

int main(){
	puts("Base 10:");
	printf("I must deliver %d pods to %d locations.\n", PODS, LOCATIONS);

	puts("Base 16:");
	printf("I must deliver %x pods to %x locations.\n", PODS, LOCATIONS);

	puts("Base 8:");
	printf("I must deliver %o pods to %o locations.\n", PODS, LOCATIONS);

	puts("Scientific notation: ");
	printf("I must deliver %E pods to %E locations.\n", (float)PODS, (float)LOCATIONS);
	return(0);
}