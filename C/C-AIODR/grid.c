#include <stdio.h>

int main(){
	char a;
	int x;
	
	for(x=1;x<10;x++){
		for(a='A';a<='I';a++){
			printf("%d%c   ",x,a); /* 3 spaces after %c */
		}
		putchar('\n'); /* end of the line */
	}
	return(0);
}