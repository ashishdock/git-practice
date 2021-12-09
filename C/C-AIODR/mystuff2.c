#include <stdio.h>

struct stuff{
	char letter;
	int number;
};

void showstuff(struct stuff the);

int main(){

	struct stuff my;
	
	puts("\n\tYour own stuff");
	
	printf("Enter your favorite letter: ");
	my.letter = getchar();

	printf("Enter your favorite number: ");
	scanf("%d", &my.number);

	showstuff(my);
	
	return(0);
}

void showstuff(struct stuff the){
	printf("Your favorite letter is: %c.\n", the.letter);
	printf("Your favorite number is %d.\n", the.number);
}