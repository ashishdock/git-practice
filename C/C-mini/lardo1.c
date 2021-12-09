#include <stdio.h>
#include <stdlib.h>

int main(){
	char weight[4];
	int w;

	printf("Enter your weight: ");
	gets(weight);
	w=atoi(weight);
	
	printf("Here is what you weigh now: %i\n", w);
	w++;
	printf("Your weight after the potatoes: %i\n", w);
	w++;
	printf("Here you are after the mutton: %i\n", w);
	w=w+8;
	printf("And your weight after dessert: %i pounds!\n", w);
	puts("Lardo!");
	return(0);
}