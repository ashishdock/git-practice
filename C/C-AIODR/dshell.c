#include <stdio.h>
#include <string.h>

void showprompt(void);

int main(){
	char input[64];
	
	do{
		showprompt();  /* call the function */
		gets(input);
		puts("Someday I must implement that function.");
	}
	while(strcasecmp("quit", input));
	puts("Oh! Apparently I did!");
	return(0);
}

void showprompt(void){
	printf("What is thy bidding?");
	
}