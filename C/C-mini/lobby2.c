#include <stdio.h>

int main(){
	char c;

	puts("1 - Beverage");
	puts("2 - Candy");
	puts("3 - Hotdog");
	puts("4 - Popcorn");
	puts("Your choice: ");

	c=getchar();
	switch(c){
	case '1':
		printf("Beverage\nThat will be $8.00.\n");
		break;
	case '2':
		printf("Candy\nThat will be $5.50.\n");
		break;
	case '3':
		printf("Hot Dog\nThat will be $10.00.\n");
		break;
	case '4':
		printf("Popcorn\nThat will be $7.50.\n");
		break;
	default:
		printf("That is not a proper selection.\n");
		printf("I'll assume you're just not hungry.\n");
		printf("Can I help whoever's next?\n");
	}

	return(0);
}