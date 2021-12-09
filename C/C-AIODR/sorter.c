#include <stdio.h>
#include <string.h>

#define SIZE 10

int main(){
	char input[SIZE][64];
	char *isort[SIZE];
	char *temp;
	int x, a, b;

/* Get the SIZE number of strings */
	printf("Enter %d types of fruit: \n", SIZE);
	for(x=0;x<SIZE;x++){
		gets(input[x]);
		isort[x] = input[x];
	}	
	
/* Sort the strings via pointers */	
	for(a=0;a<SIZE-1;a++)
		for(b=a+1;b<SIZE;b++)
			if((strcasecmp(isort[a],isort[b]) > 0)){
				temp = isort[a];
				isort[a] = isort[b];
				isort[b]=temp;
			}
		
/* print the results */
	printf("\nSorted list: \tOriginal list:\n");
	for(x=0;x<SIZE;x++)
		printf("%12s %12s\n", isort[x], input[x]);
	
	return(0);
}