#include <stdio.h>

#define POUNDS 0x9C
#define YEN 0x9E

int main(){
	float amount, bp, jy;
	float d2p = 0.5407;  /* dollars per pound */
	float d2y = 106.79;  /* dollars per yen */

	printf("Enter the amount in dollars: $");
	scanf("%f", &amount);
	bp = amount * d2p;
	jy = amount * d2y;
	puts("\tCurrency Conversion:");
	printf("%c%9.2f\n", POUNDS, bp);
	printf("%c%9.2f\n", YEN, jy);
	return(0);
}