#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(){
	FILE *myfile;
	char c;

	myfile=fopen("alive.txt","r");

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
	return(0);
}