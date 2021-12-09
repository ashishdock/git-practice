#include <stdio.h>

int main(){
	char key;
	
	printf("Press a key on your keyboard: ");
	key=getchar();
	printf("You pressed the %c key.\n", key);
	printf("It's ASCII value is %d.\n", key);
	return(0);
}