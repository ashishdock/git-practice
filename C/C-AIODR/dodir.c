#include <stdio.h>
#include <sys/types.h>
#include <dirent.h>

int main(){
	DIR *dhandle;
	
	dhandle = opendir(".");
	if(dhandle == NULL){
		puts("Error opening directory!");
		return(1);
	}	
	
	puts("Directory successfully opened!");
	closedir(dhandle);
	return(0);
}