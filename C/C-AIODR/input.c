#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	char *input;
	int size;
	
/* Allocate "enough" memory */	
	input = (char *)malloc(4069);   /* 4k input buffer, In real life, this needs to be checked for errors if memory was not allocated */
	
	printf("Enter some text: ");
	gets(input);

/* resize input buffer to save space */
	size = strlen(input) + 1; /* 01 for NULL */
	if(!realloc(input,size)){
		puts("Unable to reallocate memory.");
		return(0);
	}
	puts("Memory reallocation successful.");
	printf("String is:\n\"%s\"\n", input);
	free(input);
	printf("Memory has been released.\n");
	printf("String is:\n\"%s\"\n", input);
	return(0);
}