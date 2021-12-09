#include <stdio.h>

int main(){
	char ch;
	
	while((ch = fgetc(stdin)) != EOF){
		if(ch == ' ')
			ch = '_';
		fputc(ch,stdout);
	}
	return(0);
}