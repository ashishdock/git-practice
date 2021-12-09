#include <stdio.h>
#include <stdlib.h>

int main(){
	char input[20];
	int age;
	float height;
	
	printf("Enter your age in years: ");
	age = atoi(gets(input));

	printf("Enter your height in inches: ");
	height = atoi(gets(input));
	
	printf("\nYou are %d years old ", age);
	printf("and %f inches tall.\n", height);	
	return(0);
}