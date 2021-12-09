#include <stdio.h>

int main(){
	int age;

	printf("How old are you?");
	scanf("%d", &age);
	if(age>=65){
		printf("You're %d years old. \n", age);
		printf("How's your retirement?\n");
	}
	else{
		printf("You're %d years old.\n", age);
		printf("You have to keep on working!\n");
	}
	return(0);
}