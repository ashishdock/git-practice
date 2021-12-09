#include <stdio.h>
#include <ctype.h>

char ask(void);

int main(){
	char key;
	
	puts("Do you want to quit before you see the menu?");
	key=ask();
	if(key == 'Y') return(0);
	
	printf("Would you like to see the menu?");
	key = ask();
	if(key == 'Y') puts("Someday the menu will appear here.");
	else puts("Your choice boss!");
	return(0);
}

char ask(void){
	char c;

	printf("  (Y/N)?  ");
	fflush(stdin);
	c = toupper(getchar());
	if(c == 'N' || c == 'Y') return(c);
	else ask();
	
}