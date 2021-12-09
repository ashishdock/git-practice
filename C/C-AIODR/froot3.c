#include <stdio.h>

#define RECSIZE 14

int main(){
	FILE *f;
	char newfroot[RECSIZE] = "Snozberry";
	int record, offset;

	if(!(f = fopen("froot.txt", "r+"))){
		puts("Error writing file!");
		return(1);
	}
	
/* Replace record 12, record size = RECSIZE */
	record = 12;
	offset = record * RECSIZE;
	fseek(f, offset, SEEK_SET);

/* fwrite overwrites the 13th value */
	fwrite(newfroot, RECSIZE, 1, f);

	fclose(f);
	return(0);
}