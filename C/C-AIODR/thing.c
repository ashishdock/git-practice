#include <stdio.h>

int main(){
	const char *hello = "Greetings from your computer!";
	char byebye[] = "So long now!";
	char *b;

/* initialize the pointer */
	b = byebye;
	
	puts(hello);
	puts(b);
	
	return(0);
}