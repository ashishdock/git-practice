#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <dirent.h>

void dir(char *path);

int main(int argc, char *argv[]){
	if(argc != 2)
		dir(".");	/* dafault: current dir. */
	else
		dir(argv[1]);
	return(0);
}

void dir(char *path){
	DIR *dhandle;
	struct dirent *drecord;
	struct stat sbuff;
	int x;
	
	dhandle = opendir(path);
	if(dhandle == NULL){
		printf("Error opening directory '%s'\n", path);
		exit(1);
	}
	
	x=chdir(path);
	if (x!= 0){
		printf("Error changing to '%s'\n", path);
		exit(1);
	}
	
	printf("Directory of '%s':\n", path);
	while((drecord = readdir(dhandle))!= NULL){
		stat(drecord->d_name,&sbuff);
		if(S_ISDIR(sbuff.st_mode))
			printf("%-16s\n", drecord->d_name);
		else
			printf("%-16s\n", drecord->d_name);
		
	}
}