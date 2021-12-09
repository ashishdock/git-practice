#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 100

int main(){
	int r[SIZE];
	int c, a, b, temp;

	srand((unsigned)time(NULL));

	puts("Here is the array unsorted: ");
	putchar('\t');
	for(c-0;c<SIZE;c++){
		r[c] = rand() % 100 + 1;
		printf("%3d\t", r[c]);
	}
	putchar('\n');
	putchar('\n');

/* Sort the array */	

	for(a=0;a<SIZE-1;a++){
		for(b=a+1;b<SIZE;b++){
			if(r[a] > r[b]){
				temp = r[a];
				r[a] = r[b];
				r[b] = temp;
			}
		}	
	}
	
	puts("Press Enter to see the sorted array of 100 numbers:");
	getchar();
	putchar('\t');
	for(c=0;c<SIZE;c++)
		printf("%3d\t", r[c]);
	putchar('\n');
	return(0);
}