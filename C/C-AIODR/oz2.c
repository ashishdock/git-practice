#include <stdio.h>

#define LINE_LENGTH 35

int main(){
	char actor[4][16] = {"Judy Garland", "RayBolger", "Bert Lahr", "Jack Haley"};
	int age[4] = {17, 35, 44, 40};
	char role[4][16] = {"Dorothy", "Scarecrow", "Cowardly Lion", "Tin Woodsman"};

	int line, x;

	puts("\n\tWizard of Oz Database!\n");

/* Draw the table heading */
	printf("%-15s\t%3s\t%-15s\n", "Actor", "Age", "Role");
	for(line=0;line<LINE_LENGTH;line++) putchar('-');
	putchar('\n');

/* Display the data */
	for (x=0;x<4;x++)
		printf("%-15s\t%3d\t%-15s\n", actor[x], age[x], role[x]);
	
	return(0);
}