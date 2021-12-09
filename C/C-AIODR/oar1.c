#include <stdio.h>

void binString(int n);

int main(){
	int twos= 1;
	int x, r;
	unsigned short int v = 0;

	for(x=0;x<16;x++){
		r = v | twos;
		printf("0x%04X | %5d = 0x%04X or ", v, twos, r);
		binString(r);
		putchar('\n');
		twos += twos;
	}
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