#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <dirent.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>

#define BUFSIZE 128

int main(){
	FILE *myfile;
	char c;
	char orgdir[BUFSIZE];

	myfile=fopen("C:\\Notepad++\\alive.txt","r");

	if(myfile){ 	/* The file already exists */
		puts("ALIVE.TXT already exists");
		printf("Overwrite it? [Y/N]");
		c=toupper(getchar());
		if(c!='Y'){
			puts("Okay, Good-bye.");
			fclose(myfile);
			exit(1);
		}
	}

	myfile = fopen("alive.txt", "w");
	if(myfile == NULL){
		puts("Some kind of error!");
		exit(0);
	}
	
	fprintf(myfile, "I created a file! It's alive!\n");
	fclose(myfile);	

	getcwd(orgdir, BUFSIZE);
	printf("The current working directory is \t %s \n", orgdir);
	

	char *path;
	path = "c:\\";
	chdir(path);
	getcwd(orgdir, BUFSIZE);
	printf("The current working directory now is \t %s \n", orgdir);


	myfile = fopen("alive.txt", "w");
	if(myfile == NULL){
		puts("Some kind of error!");
		exit(0);
	}
	printf("File created!");
	fprintf(myfile, "I created a file! It's alive!\n");
	fclose(myfile);	


	return(0);
}