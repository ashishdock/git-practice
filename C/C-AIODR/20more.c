#include <stdio.h>

int main(){
	int value;
	
	do{
		printf("Enter a value greater than 20.\n");
		scanf("%d", &value);
	} while (value <=20);
	printf("Thank you! You entered %d.\n", value);
	return(0);
}