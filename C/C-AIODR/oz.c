#include <stdio.h>

#define LINE_LENGTH 35

int main(){
	char actor[] = "Judy Garland";
	int age = 17;
	char role[] = "Dorothy";
	int line;

	puts("Wizard of Oz Database!\n");

/* Draw the table heading */
	printf("%-15s\t%3s\t%-15s\n", "Actor", "Age", "Role");
	for(line=0;line<LINE_LENGTH;line++) putchar('-');
	putchar('\n');

/* Display the data */
	printf("%-15s\t%3d\t%-15s\n", actor, age, role);
	
	return(0);
}