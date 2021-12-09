#include <stdio.h>

int main(){
	char c;
	int done;
	float total;
	
	puts("1 - Beverage");
	puts("2 - Candy");
	puts("3 - Hotdog");
	puts("4 - Popcorn");
	puts("= - DONE and GET TOTAL BILL AMOUNT");

	done=0;
	while(!done){
		c=getchar();
		switch(c){
			case '1':
				printf("Beverage\t$8.00\n");
				total+=8;
				break;
			case '2':
				printf("Candy\t\t$5.50\n");
				total+=5.50;
				break;
			case '3':
				printf("Hot dog\t\t$10.00\n");
				total+=10.00;
				break;
			case '4':
				printf("Popcorn\t\t$7.50\n");
				total+=7.50;
				break;
			case '=':
				printf("\nTotal of \t\t$%.2f\n", total);
				printf("Please pay the cashier \t$%.2f\n", total);
				done=1;
				break;
			default:
				printf("Improper selection.\n");
		} /* end switch */
	} /* end while */
	return(0);
}