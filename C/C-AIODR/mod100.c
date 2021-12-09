#include <stdio.h>

int main(){
	int m, c;
	putchar('\t');
	for(c=0;c<100;c++){
		m = c % 10;
		printf("%d\t", m);
	}
	
	return(0);
}
