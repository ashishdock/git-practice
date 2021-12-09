#include <stdio.h>
#include <unistd.h>

#define BUFSIZE 128

int main(){
	char orgdir[BUFSIZE];
	int x;
	
	getcwd(orgdir, BUFSIZE);
	if(getcwd(orgdir, BUFSIZE) == NULL){
		puts("Error returning current work directory! May be the string buffer is too less to return the complete path of currect work directory.");
		return(1);
	}
	else
		printf("\nThe current working directory is: %s\n", orgdir);
	
	puts("\nChanging to the root directory...\n");
	x = chdir("\\");
	if(x != 0){
		puts("Error changing directories!");
		return(1);
	}
	else{
		getcwd(orgdir, BUFSIZE);
		if(getcwd(orgdir, BUFSIZE) == NULL){
			puts("Error returning current work directory! May be the string buffer is too less to return the complete path of currect work directory.");
			return(1);
		}
		else
			printf("The current working directory is: %s\n ", orgdir);		
	}
	return(0);
}