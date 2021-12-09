#include <stdio.h>

int main(){
	char yours[25];
	char mine[] = "Henry";

	printf("What is your name?");
	gets(yours);
	mine = yours;
	printf("My name is %s just like your name is %s!\n", mine, yours);	
	return(0);
}