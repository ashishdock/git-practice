#include <stdio.h>

int main(){
	int number;
	float iq;
	char first;

	puts("\tIQ Calculator");
	printf("Enter your house or apartment number: \n");
	scanf("%d", &number);
	fflush(stdin);
	printf("Enter the first letter of your last name: \n");
	scanf("%c", &first);
	puts("Calculating your IQ...");
	iq = number / first;
	printf("This computer guesses your IQ to be %f.\n", iq);
	
	return(0);
}