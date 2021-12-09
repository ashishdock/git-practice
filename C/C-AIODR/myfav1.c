#include <stdio.h>

int main () {
	int fav;
	
	printf("Enter your favorite number, 1 thru 10: ");
	scanf("%d", &fav);
	if(fav == 7)
		printf("That's my favorite number, too!");	
	return(0);
}