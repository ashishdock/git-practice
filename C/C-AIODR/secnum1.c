#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void separator(int repeat);

int main(){
	srand((unsigned)time(NULL));
	
	puts("Here are today's secret number values: ");
	separator(10);
	separator(15);
	separator(20);
	return(0);
}

void separator(int repeat){
	int x;
	long int r;

	for(x=0;x<repeat;x++)
		putchar('*');

	putchar('\n');
	r = rand();
	printf("%d\n", r);
}