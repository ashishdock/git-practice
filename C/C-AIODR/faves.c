#include <stdio.h>

int main(){
	char letter, number;
	
	printf("What is your favorite letter?");
	letter=getchar();
	fflush(stdin);
	printf("What is your favorite number?");
	number=getchar();
	fflush(stdin);
	printf("Thank you!\n%c is your favorite letter and %c is your favorite number.\n", letter, number);
	return(0);
}