#include <stdio.h>

int main(){
	char dwarf[7][8] = {"bashful", "doc", "dopey", "grumpy", "happy", "sneezy", "sleepy" };
	const char *seven[] = {"bashful", "doc", "dopey", "grumpy", "happy", "sneezy", "sleepy" };
	
	int x;
	
	for(x=0;x<7;x++){
		printf("%10s - %10s\n", dwarf[x], seven[x]);
		printf("Size of dwarf[%d] is %d and size of seven[%d] is %d.\n", x, sizeof(dwarf[x]), x, sizeof(seven[x]));
	}
	return(0);
}