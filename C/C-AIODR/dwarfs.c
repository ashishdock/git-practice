#include <stdio.h>
#include <string.h>

int main(){
	char dwarf[7] [2] [8] = {"bashful", "?", "doc", "?", "dopey", "?", "grumpy", "?", "happy", "?", "sneezy", "?", "sleepy", "?"};
	char input[64];
	int named = 0;
	int x;
	
	puts("\n\tSee if you can name all seven dwarfs: ");
	
	while(named<7){
		if(named==1)
			printf("So far you've named %d dwarf.\n", named);
		else
			printf("So far you've named %d dwarfs.\n", named);
		printf("\nEnter a name: ");
		gets(input);
/* Check for no input */
		if(strcmp(input, "") == 0)
			break;
		for(x=0;x<7;x++){
			if(strcasecmp(input,dwarf[x][0]) == 0){
				if(dwarf[x][1][0] == '!')
					puts("\n\tYou already named that dwarf!\n");
				else{
					printf("Yes! %s is right.\n", input);
					dwarf[x][1][0] = '!';
					named++;
				}
			}
		}
		
	}
	if(named == 7)
		puts("\n\t\t*** You got'em all! Snow would be proud! ***");
	else
		puts("Try again:");
	
	return(0);
}