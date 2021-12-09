#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void separator(int repeat, char c);

int main(){
	srand((unsigned)time(NULL));

	puts("Here are today's secret number values: ");
	separator(10, '*');
	separator(15, '-');
	separator(20, '#');
	return(0);
}

void separator(int repeat, char c){
	int x;
	long int r;
	
	for(x=0;x<repeat;x++)
		printf("%c", c);
	putchar('\n');
	r = rand();
	printf("%d\n", r);	
}