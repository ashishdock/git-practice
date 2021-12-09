#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#include <dirent.h>

#define BUFSIZE 128

void error_exit(char *message);

int main(int argc, char *argv[]){
	char original_file[256];
	char duplicate_file[256];
	char new_name[256];
	FILE *org, *dup;
	char ch;
	int len;

	char orgdir[BUFSIZE];
	char *path;
	path = "c:\\";
	chdir(path);
	getcwd(orgdir, BUFSIZE);
	printf("The current working directory is \t %s \n", orgdir);
	dup = fopen("move.txt", "w+");
	

	if(dup != NULL)
		printf("duplicate file created!");
	if(dup == NULL)
		error_exit("Duplicate did not open/create.");

	fclose(dup);



/* And we're done */
	puts("File moved!");
	return(0);
}



void error_exit(char *message){
	printf("ERROR: %s\n", message);
	exit(1);
}