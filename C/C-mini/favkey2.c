#include <stdio.h>

int main(){
	char key;

	puts("Type your favorite keyboard character: ");
	key=getchar();
	printf("Your favorite keyboard character is: %c", key);
	return(0);
}