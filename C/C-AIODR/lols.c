#include <stdio.h>

int main(){
	int start, finish;
	int *examine;

	start = 100;
	finish = 9;

	examine = &start;
	printf("%d little old ladies started the race.\n", *examine);
	examine = &finish;
	printf("But only %d little old ladies finished.\n", *examine);
	return(0);
}