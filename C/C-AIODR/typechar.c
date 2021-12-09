#include <stdio.h>

int main(){
	char t;
	
	printf("Please type a character:");
	t = getchar();
	printf("Thank you for typing the '%c' character.\n", t);
	return(0);
}