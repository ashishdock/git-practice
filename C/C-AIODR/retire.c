#include <stdio.h>

int main(){
	int age;
	
	printf("How old are you?");
	scanf("%d", &age);
	if(age > 64){
		printf("You're %d years old.\n", age);
		printf("How's your retirement?\n");
	}
	return(0);
}