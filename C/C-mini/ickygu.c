#include <stdio.h>

int main(){
	char menuitem[]="Slimy Orange Stuff \"Icky Woka Gu\"";
	int pints=1;
	float price=1.45;
	
	printf("Today special - %s\n", menuitem);
	printf("You want %d pint.\n", pints);
	printf("That be $%.2f, please.\n", price);
	return(0);
}