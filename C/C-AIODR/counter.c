#include <stdio.h>

int string_count(char *s){
	int count = 1;
	
	if(*s++)
		count += string_count(s);
	else count--;
	return(count);
}

int main(){
	char *string = "Count me! Count me, you fool!";
	int length;

	length = string_count(string);
	printf("The string: \n\t%s\nis %d characters long.\n", string, length);
	return(0);
}