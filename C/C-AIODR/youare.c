#include <stdio.h>

int main(){
	char name[20];
	
	printf("What is your name?");
	gets(name);
	printf("Pleased to meet you, %s!\n", name);
	return(0);
}