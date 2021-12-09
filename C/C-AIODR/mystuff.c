#include <stdio.h>

int main(){
	char input[10];
	
	struct stuff{
		char letter;
		int number;
	};

	struct stuff my;

	puts("Your Own Stuff");
	
	printf("Enter your favorite letter: ");
	my.letter = getchar();
	printf("Enter your favorite number: ");
	scanf("%d", &my.number);

	printf("Your favorite letter is %c\n", my.letter);
	printf("and your favorite number is %d.\n", my.number);
	return(0);
}