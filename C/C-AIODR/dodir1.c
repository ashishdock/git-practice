#include <stdio.h>
#include <sys/types.h>
#include <dirent.h>

int main(){
	DIR *dhandle;
	struct dirent *drecord;
	
	dhandle = opendir(".");
	if(dhandle == NULL){
		puts("Error opening directory!");
		return(1);
	}	
	
	while((drecord = readdir(dhandle))!=NULL)
		printf("%s\n", drecord->d_name);

	closedir(dhandle);
	return(0);
}