#include <stdio.h>
#include <stdlib.h>

#define BUFSIZE 255

void main(int argc, char *argv[]){
	FILE *viewfile;
	char buffer[BUFSIZE+1];	/* storage */
	
/* check for proper no. of arguments */
	if(argc<2){
		puts("Missing filename!");
		puts("Here is the format:");
		puts("VIEW filename");		
		exit(1);
	}

/* Does the file exist? */
	viewfile = fopen(argv[1], "r");
	if(!viewfile){
		printf("Error opening \"%s\"\n", argv[1]);
		exit(1);
	}

/* display the file's guts */
	while(fgets(buffer, BUFSIZE, viewfile))
		printf("%s", buffer);
	fclose(viewfile);

}