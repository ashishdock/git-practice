#include <stdio.h>
#include <ctype.h>

int main(){
	char input[128];
	int x, spaces, letters;
	
	x = 0;
	spaces = 0;
	letters = 0;

	printf("Enter the first line of a poem: ");
	gets(input);

/* Scan the text */	
	while(input[x]){
		if(isspace(input[x]))
			spaces++;
		if(isalpha(input[x]))
			letters++;
		x++;
	}	
	printf("That sentence has %d spaces and %d letters.\n", spaces, letters);
	return(0);
}