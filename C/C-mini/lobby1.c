/* Theater lobby snack bar program */

#include <stdio.h>

int main(){
	char c;
	do{
	puts("Please make your choice for snack: ");
	puts("1 - Beverage.");
	puts("2 - Candy.");
	puts("3 - Hot Dog.");
	puts("4 - Popcorn.");
	puts("Your choice: ");

/* Figure out what they typed in. */

	c=getchar();
	if(c=='1')
		printf("Beverage\n That will be $8.00.\n");
	else if(c=='2')
		printf("Candy\n That will be $5.50.\n");
	else if(c=='3')
		printf("Hot Dog\n That will be $10.00.\n");
	else if(c=='4')
		printf("Popcorn\n That will be $7.50.\n");
	else {
		printf("That is not a proper selection.\n");
		printf("I'll assume you're just not hungry.\n");
		printf("Can I help whoever's next?\n");
	}
	}while (c>'4');	
	return(0);
}