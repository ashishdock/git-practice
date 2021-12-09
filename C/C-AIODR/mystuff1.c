#include <stdio.h>

int main(){
	char input[10];
	
	struct stuff{
		char letter;
		int number;
	}my, his;
/* Here is his info */
	
	his.letter = 'Y';
	his.number = 199;

	puts("Your Own Stuff");
	
	printf("Enter your favorite letter: ");
	my.letter = getchar();
	printf("Enter your favorite number: ");
	scanf("%d", &my.number);

	printf("Your favorite letter is %c\n", my.letter);
	printf("and your favorite number is %d.\n", my.number);
	printf("His favorite letter is %c\n", his.letter);
	printf("and his favorite number is %d.\n", his.number);
	return(0);
}