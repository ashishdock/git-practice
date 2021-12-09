#include <stdio.h>

int main(){
	int b;
	
	printf("Here is your two's table:\n\n");
	for(b=2;b<=20;b=b+2)
		printf("%d\n", b);
	return(0);
}