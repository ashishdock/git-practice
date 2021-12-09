#include <stdio.h>

int main(){
	unsigned short int hex, upper, lower;

	printf("Enter a four-digit hex value: ");
	scanf("%x", &hex);
	lower = hex & 0x00FF;
	upper = hex & 0xFF0;
	upper >> 8;
	
	printf("0x%04X is composed of %02X and %02X\n", hex, upper, lower);
	
	return(0);
}