#include <stdio.h>
#include <unistd.h>

#define BUFSIZE 128

int main(){
	char buffer[BUFSIZE];
	
	getcwd(buffer, BUFSIZE);
	if(getcwd(buffer, BUFSIZE) == NULL)
		puts("Error getting current work directory! May be the string buffer size is less than the current work directory length.");
	else
		printf("The current working directory is: \n\t%s\n", buffer);
	
	return(0);
}