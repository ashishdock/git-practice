#include <stdio.h>

#define LINE_LENGTH 45

int main(){
	struct oz {
		char actor[18];
		int age;
		char role[16];
	};

	struct oz cast[6] = {"Judy Garland", 17 ,"Dorothy", "Ray Bolger", 35, "Scarecrow", "Bert Lahr", 44, "Cowardly Lion", "Jack Haley", 40, "Tin Woodsman", "Margaret Hamilton", 37, "Wicked Witch", "Frank Morgan", 49, "The Wizard"};

	struct oz temp;
	int x, line;

/* Swap Margaret and Frank */
	temp = cast[4];
	cast[4] = cast[5];
	cast[5] = temp;

	puts("\n\tWizard of Oz Database!\n");

/* Draw the table heading */
	printf("%-18s\t%3s\t%-15s\n", "Actor", "Age", "Role");
	for(line=0;line<LINE_LENGTH;line++) putchar('-');
	putchar('\n');

/* Display the data */
	for (x=0;x<6;x++)
		printf("%-18s\t%3d\t%-15s\n", cast[x].actor, cast[x].age, cast[x].role);
	
	return(0);
}