#include <stdio.h>

void binString(int n);

int main(){
	unsigned short int value;

	printf("Enter an integer value, 0 to 65,535: ");
	scanf("%d", &value);
	
	printf("Decimal value is %d\n", value);
	printf("Hexadecimal value is 0x%X\n", value);
	printf("Binary value is ");
	binString(value);
	putchar('\n');
	return(0);
}

void binString(int n){
	char bin[17];
	int x;

	for(x=0;x<16;x++){
		bin[x] = n & 0x8000 ? '1' : '0';
		n <<= 1;
	}
	bin[16] = '\0';
	printf("%s", bin);
}