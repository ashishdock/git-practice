#include <stdio.h>

int main(){
	int age;

	printf("Enter your age in years: ");
	scanf("%d", &age);
	printf("You are %d years old.\n", age);
	age++;
	printf("In one year you'll be %d.\n", age);
	return(0);
}