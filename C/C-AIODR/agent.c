#include <stdio.h>

int main(){
	int agent;
	char code;

	printf("Enter your agent number: \n");
	scanf("%d", &agent);
	fflush(stdin);
	printf("Enter your single digit code-key: \n");
	scanf("%c", &code);

	if(agent == 7 && code == 'B'){
		printf("\n\tWelcome aboard, James Bond.\n");
		printf("\tYou may commence with operation Freecell.\n");
	}
	else {
		printf("\t\tThe authorities have been notified ");
		printf("of this illegal access.");
	}
	return(0);
}