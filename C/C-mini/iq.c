#include <stdio.h>
#include <stdlib.h>

int getval(void);

int main(){
	int age, weight, area;
	float iq;
	
	puts("Program to calculate your IQ.");
	puts("Enter your age:");
	age=getval();
	puts("Enter your weight:");
	weight=getval();
	puts("Enter your area code:");
	area=getval();
	iq=(float)(age*weight)/area;
	printf("This computer estimates your IQ to be %f.\n", iq);
	return(0);
}

int getval(){
	char input[20];
	int x;

	gets(input);
	x=atoi(input);
	return(x);
}