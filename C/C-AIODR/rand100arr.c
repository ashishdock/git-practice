#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define COUNT 100

int main(){
	int r[COUNT];
	int c;
	
	srand((unsigned)time(NULL));
	
	for(c=0;c<COUNT;c++)
		r[c]=rand() %100 + 1;

	printf("100 Random Numbers:\n");
	putchar('\t');
	for(c=0;c<COUNT;c++)
		printf("%d\t", r[c]);
	putchar('\n');

/* Reinitialize the array */
	
	printf("100 NEW randome numbers:\n");
	putchar('\t');
	for(c=0;c<COUNT;c++){
		r[c]=rand() % 100 +1;
		printf("%d\t", r[c]);
	}
	return (0);
}