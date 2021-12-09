#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define RANGE 100

int main(){
	int guess, number;

	srand((unsigned)time(NULL));
	
	puts("\n\n\n\t\t\t\tGuessing Game!\n");
	printf("\t\t\t  ****************************\n");
	number = rand() % RANGE + 1; /* Value from 1 to RANGE */
	printf("\t\tI'm thinking of a number from 1 to %d.\n", RANGE);
	printf("\t\tCan you guess what it is?\n");
	
	do{
		printf("\nEnter your guess: \n\n");
		scanf("%d", &guess);
		if(guess == number){
			printf("\a");
			printf("\t\aYou are awesome. You guessed right. The number is indeed %d.\n", number);
			break;
		}
		else if(guess < (number) && (number - guess <= 10)) printf("\tYou are guessing a little low. But you are close.\n");
		else if(guess > (number) && (guess - number <= 10)) printf("\tYou are guessing a little high. But you are close.\n");
		else if(guess > number) printf("\tYou are guessing too high!\n");
		else if(guess < number) printf("\tYou are guessing too low!\n");
	} while (guess!=number);
	return(0);
}