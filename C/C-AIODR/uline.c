#include <stdio.h>

void underline(char *string);

int main(){
	underline("This year's Starting Line up");	
	return(0);
}

void underline(char *string){
	puts(string);
	while(*string){
		putchar('=');
		string++;
	}
	putchar('\n');
}