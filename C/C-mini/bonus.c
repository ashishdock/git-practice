#include <stdio.h>

float bonus(char x);

int main(){
	char name[20];
	char level;
	float b;
	
	puts("Enter Employee name: ");
	gets(name);
	puts("Enter bonus level(0, 1 or 2)\n");
	level=getchar();
	b=bonus(level);
	b*=100;
	printf("The bonus for %s will be $%.2f.\n", name, b);
	return(0);
}

/* Calculate the bonus */

float bonus(char x){
	if(x=='0') return (0.33); /* Bottom level bonus */
	if(x=='1') return (1.50); /* Second level bonus */
	return(3.10); /* Highest level bonus */
}