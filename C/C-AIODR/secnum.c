#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void separator(void);

int main(){
	long int r;
	srand((unsigned)time(NULL));
	
	puts("Here are today's secret number values: ");
	separator();
	r=rand();
	printf("%d\n", r);
	separator();
	r=rand();
	printf("%d\n", r);
	separator();
	r=rand();
	printf("%d\n", r);
	separator();
	return(0);
}

void separator(){
	int r;
	
	for(r=0;r<10;r++)
		putchar('*');
	putchar('\n');
}