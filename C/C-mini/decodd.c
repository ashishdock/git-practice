#include <stdio.h>

int main(){
	int a, b;
	a=10;
	b=0;
	printf("A=%d and B=%d before decrementing.\n", a, b);
	b=a--;
	printf("A=%d and B=%d after decrementing using post --.\n", a, b);
	b=--a;	
	printf("A=%d and B=%d after decrementing using pre --.\n", a, b);	
	return(0);
}