#include <stdio.h>

int main(){
	char firstname[20];
	char lastname[20];

	printf("What is your first name?");
	gets(firstname);
	printf("What is your last name?");
	gets(lastname);
	printf("Pleased to meet you %s %s!\n", firstname, lastname);
	return(0);
}