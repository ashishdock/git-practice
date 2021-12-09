#include <stdio.h>

#define RECSIZE 14

int main(){
	FILE *f;
	char froot[RECSIZE];
	int record, offset;

	if(!(f = fopen("froot.txt", "r"))){
		puts("Error reading file!");
		return(1);
	}
	
/* Get record 12, record size = RECSIZE */
	record = 12;
	offset = record * RECSIZE;
	fseek(f, offset, SEEK_SET);

/* fread reads the 13th value and puts it in the string variable froot */
	fread(froot, RECSIZE, 1, f);
	printf("%2d: %s\n", record, froot);

	fclose(f);
	return(0);
}