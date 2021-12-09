#include <stdio.h>
#include <stdlib.h>

int main(){
	char input[20];
	int age;
	float height;
	
	printf("Enter your age in years: ");
	age = atoi(gets(input));
	age = age * 12;
	
	printf("Enter your height in inches: ");
	height = atof(gets(input));
	height = height * 2.2;
	
	printf("You are %d months old\n", age);
	printf("and %f centimeters tall.\n", height);	
	return(0);
}