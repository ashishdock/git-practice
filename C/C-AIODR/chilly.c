#include <stdio.h>

int main(){
	float temp;
	
	printf("What is the temperature outside?");
	scanf("%f", &temp);
	if(temp < 65)
		printf("My but it's a bit chilly out.\n");
	else if(temp>=80)
		printf("My but it's hot out");
	else
		printf("My how pleasant!");
	return(0);
}