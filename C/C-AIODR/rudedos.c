#include <stdio.h>
#include <string.h>

int main(){
	char command[64];
	char response[] = "You think I know how to ";
	char new[128];

	while(strcasecmp(command, "quit")){
		printf("c:\\>");
		gets(command);

		strcpy(new, response);
		strcat(new, command);
		strcat(new,"?");
		puts(new);
	}
	puts("Well, maybe I do...");
	return(0);
}