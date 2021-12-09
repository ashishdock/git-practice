#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <dirent.h>

void dir(char *path);

int y = 0;	/* File count */
int z = 0; /* Total byte size */
int a = 0; /* Directory count */

int main(int argc, char *argv[]){
	if(argc != 2)
		dir(".");	/* dafault: current dir. */
	else
		dir(argv[1]);
	printf("\t%d directory(s).", a);
	printf("\n\t%d file(s) (including files in subdirectory(s)) for a total of %d bytes.\n", y, z);
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
		if(S_ISDIR(sbuff.st_mode)){
			if(strcmp(drecord->d_name, ".") == 0|| strcmp(drecord->d_name, "..") == 0)
				continue;
			a++;
			printf("%-20s  %-10s ...\n", drecord->d_name, "<DIR>");
			dir(drecord->d_name);
		}	
		else{
			printf("%-20s  %-10d bytes\n", drecord->d_name, sbuff.st_size);	
			y++;
			z += sbuff.st_size;
		}
	}
	putchar('\n');
	chdir("..");
	closedir(dhandle);
}