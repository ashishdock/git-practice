#include <stdio.h>
#include <stdlib.h>

int main(){
	char num[2];
	int number;

	printf("I am your computer genie!\n");

	printf("Enter a number from 0 to 9: ");
	gets(num);
	number=atoi(num);

	if(number<5){
		printf("That number is less than 5.\n");
	}
	printf("The genie knows all, sees all!\n");
	return(0);
}