#include <stdio.h>
#include <string.h>

int main(){
	char string[16];
	char password[] = "please";
	int result;

	printf("Enter your secret password: ");
	gets(string);

	result = strcmp(string, password);

	if(result == 0)
		puts("Entry granted!");
	else
		puts("Sorry. Wrong password!");	
	return(0);
}