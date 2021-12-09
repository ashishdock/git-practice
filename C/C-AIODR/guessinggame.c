#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	int value, b;

	srand((unsigned)time(NULL));
	
	b=(rand() % 5) + 1;
	do {
		printf("Can you guess what number I am thinking of between 1 and 5? ");
		scanf("%d", &value);
	} while (value != b);
	printf("\a");
	printf("\aWOW! You are amazing! You guessed right. I was indeed thinking of the number %d", value);
	return(0);
}