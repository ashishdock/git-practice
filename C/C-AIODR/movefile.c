#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

void error_exit(char *message);

int main(int argc, char *argv[]){
	char original_file[256];
	char duplicate_file[256];
	char new_name[256];
	FILE *org, *dup;
	char ch;
	int len;
	
/* gather information */	
	puts("Movefile - a moving file utility");
	printf("Enter the name of the original file: ");
	scanf("%255s", &original_file);

	if(strlen(original_file) == 0)
		error_exit("Missing filename!");

	
	printf("Enter the target directory: ");
	scanf("%255s", &duplicate_file);
	if(strlen(duplicate_file) == 0)
		error_exit("Missing destination directory!");
	/* fix path, if necessary */
	len = strlen(duplicate_file);
	if(duplicate_file[len-1] != '\\' && )
		strcat(duplicate_file,"\\"); /* add trailing \ for windows */
	
	printf("Give the file a new name? (Y/N): ");
	fflush(stdin);
	ch = toupper(getchar());
	if(ch == 'Y'){
		printf("Enter new name: ");
		scanf("%255s", &new_name);
		if(strlen(new_name) == 0)
			error_exit("No new name specified");
		strcat(duplicate_file, new_name);
	}
	else
		strcat(duplicate_file, original_file);
	
	printf("\nMoving file '%s' to '%s'\n\n", original_file, duplicate_file);
	
/* First, copy the file */	
	org = fopen(original_file, "r");
	dup = fopen(duplicate_file, "w");
	if(org == NULL)
		error_exit("Original did not open.");
	if(dup == NULL)
		error_exit("Duplicate did not open/create.");

	while((ch = fgetc(org))!=EOF)
		fputc(ch, dup);
	
	fclose(org);
	fclose(dup);

/* No delete the original file */
	unlink(original_file);

/* And we're done */
	puts("File moved!");
	return(0);
}


void error_exit(char *message){
	printf("ERROR: %s\n", message);
	exit(1);
}