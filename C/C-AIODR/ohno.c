#include <stdio.h>

int main(){
	int naughty = 0;

	loop:
		puts("Naughty, naughty");
		naughty++;
		if(naughty < 10) goto loop;
	return(0);
}