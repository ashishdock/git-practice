#include <stdio.h>

#define SIZE 6

int main(){
	int lotto[] = { 10, 48, 1, 37, 6, 24 };
	int c, a, b, temp;

	puts("Here is an array unsorted:");
	for(c=0;c<SIZE;c++)
		printf("%2d  ", lotto[c]); 
	putchar('\n');
	putchar('\n');

/* Sort the array */
	for(a=0;a<SIZE-1;a++){
		for(b=a+1;b<SIZE;b++){
			if(lotto[a]>lotto[b]){
				printf("lotto[%d] = %d and lotto[%d] = %d\n", a, lotto[a], b, lotto[b]);
				temp = lotto[b];
				printf("Temp = %d\n", temp);
				lotto[b] = lotto [a];
				printf("lotto[%d] is now = %d\n", b, lotto[b]);
				lotto[a] = temp;
				printf("lotto[%d] is now = %d\n", a, lotto[a]);
				printf("Array is now:");
				for(c=0;c<SIZE;c++){
					printf("%d  ", lotto[c]);
				}
				printf("\n\n");
			}
		}
	}
	
/* Display the sorted result */
	puts("Here is the sorted array:");
	for(c=0;c<SIZE;c++)
		printf("%d  ", lotto[c]);
	putchar('\n');
	return(0);
}