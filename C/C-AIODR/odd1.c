#include <stdio.h>

#define SIZE 5

int *odds(void);

int main(){
	int *n;
	int x;
	n = odds();
	for(x=0;x<SIZE;x++)
		printf("Element # %d = %d\n",x, *(n +x));
	return(0);
}

int *odds(void){
	static int o[SIZE];
	int x;
	for(x=0;x<SIZE;x++)
		o[x] = 2 * x + 1;
	return(o);
}