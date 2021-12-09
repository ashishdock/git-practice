#include <stdio.h>

int main(){
	int profits, profits3;
	int income = 120;
	int expenses = 27;

	profits = income - expenses;
	profits3 = income - expenses * 3;
/* not using parentheses */
	printf("Garage Sale profits were $%d.\n", profits);
	printf("Triple profits would have been $%d.\n", profits3);
	return(0);
}