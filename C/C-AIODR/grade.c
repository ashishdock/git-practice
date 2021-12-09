#include <stdio.h>

int main(){
	int grade;
	
	printf("Enter your grade on the last test (0 to 100): ");
	scanf("%d", &grade);
	printf("The computer says you: ");
	printf("%s\n",(grade>=60) ? "Passed" : "Failed");
	return(0);
}