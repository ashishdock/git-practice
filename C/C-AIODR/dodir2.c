#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <dirent.h>

int main(){
	DIR *dhandle;
	struct dirent *drecord;
	struct stat sbuff;
	int x, y;
	y = 0;

	dhandle = opendir(".");
	if(dhandle == NULL){
		puts("Error opening directory!");
		return(1);
	}	
	
	while((drecord = readdir(dhandle))!=NULL){
		x = stat(drecord->d_name, &sbuff);
			if(x!=0){
				puts("Error reading file!");
				return(1);
			}
			if(S_ISDIR(sbuff.st_mode)){
				printf("%-20s  %-10s ...\n", drecord->d_name, "<DIR>");
				y++;
			}
			else{
				printf("%-20s  %-10d bytes\n", drecord->d_name, sbuff.st_size);
				y++;
			}
	
	}
	closedir(dhandle);
	return(0);
}