#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	long int hat;
	int loop;
	
	srand((unsigned)time(NULL));
	
	putchar('\t');
	
	for(loop=0;loop<100;loop++){
		hat=rand();
		printf("%10d\t", hat);
	}
	return(0);
}