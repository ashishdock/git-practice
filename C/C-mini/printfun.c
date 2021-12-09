/*
printf() escape sequence demonstration program
*/

#include <stdio.h>

int main(){
	printf("Here is the \\a sequence: \a\a\a");
	

	printf("\nAble\tBaker\tCharlie");
	printf("\n1\t2\t3");
	printf("\nAlpha\tBeta\tGamma");
	printf("\nHere is the \\b backspace sequence: \b\b\b\b");
	printf("\nHere is the \\r sequence:\r");
	getchar();
	return(0);
}