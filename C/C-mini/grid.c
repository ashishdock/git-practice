#include <stdio.h>

int main(){
	int a;
	char b;
	
	printf("Here is thy grid...\n");

	for(a=1;a<10;a++){
		for(b='A';b<'K';b++){
			printf("%d-%c ", a, b);
		}
		putchar('\n'); /* End of Line  */
	}
	return(0);
}