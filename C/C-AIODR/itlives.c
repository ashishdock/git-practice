#include <stdio.h>

int main(){
	FILE *myfile;
	char c;

	myfile = fopen("alive.txt", "r");
	if(!myfile){
		puts("ALIVE.TXT not found!");
	}
	
/*	do{
		c = fgetc(myfile);
		putchar(c);
	}while(c != EOF);
*/
	while((c = fgetc(myfile)) != EOF)
		putchar(c);
	fclose(myfile);
	return(0);
}