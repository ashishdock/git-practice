#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
	FILE *dump_me;
	int i;
	int x = 0;
	
/* Check for filename argument */	
	if(argc<2){
		puts("Format: DUMP filename");
		exit(1);
	}

/* Open the file argv[1] in read-binary mode */
	dump_me = fopen(argv[1],"rb");
	if(dump_me == NULL){
		printf("Error opening %s\n", argv[1]);
		exit(1);
	}

/* Display the file's content in hex */
	while((i=fgetc(dump_me))!=EOF){
		printf("%0.2X ", i);
		x++;
		if(!(x%16)) putchar('\n');
	}

	fclose(dump_me);

/* file trivia display */
	printf("\n%s: size = %u bytes\n", argv[1], x);
	return(0);
}