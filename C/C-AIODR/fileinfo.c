#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <time.h>

int main(){
	struct stat fbuf;
	int x;
	
	x = stat("fileinfo.c", &fbuf);
	if(x!=0){
		puts("Error reading file!");
		return(1);
	}
	puts("Some file stats on FILEINFO.C: ");
	printf("File size is %d bytes\n", fbuf.st_size);
	printf("File last modified %s\n", ctime(&fbuf.st_mtime));
	return(0);
}