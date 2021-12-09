#include <stdio.h>

int main(){
	char text[] = "Going! Going! Gone!";
	char *t;

/* Initialize the pointer */
	t = text;
	putchar(*t);
	puts(t);
/* display the string */
	while(*t){
		puts(t);
		t++;
	}
	return(0);
}