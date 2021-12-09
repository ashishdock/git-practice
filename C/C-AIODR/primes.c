#include <stdio.h>

int main(){
	int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
	int *p;
	int x;

	p = primes;
	for(x=0;x<10;x++){
		printf("%d\n", *p);
		p++;
	}
	return(0);
}