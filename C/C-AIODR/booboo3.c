#include <stdio.h>
#include <string.h>

int main(){
	char yours[25];
	char mine[25];

	printf("What is your name? ");
	gets(yours);
	strcpy(mine, yours);
	printf("My name is %s just like your name is %s!\n", mine, yours);	
	return(0);
}