#include <stdio.h>

float baby(float food);

int main(){
	float input, output;
	
	printf("Enter quantity you plan on feeding the baby: ");
	scanf("%f", &input);
	
	output = baby(input);

	printf("According to the computer, baby will\n");
	printf("produce %.2f material as output.\n", output);
	return(0);
}

float baby(float food){
	float poop;
	
	poop = 1.217*food;
	return(poop);
}