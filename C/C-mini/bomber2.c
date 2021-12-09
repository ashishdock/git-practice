#include <stdio.h>

#define COUNT 20000000 /*20,000,000 */

void dropBomb(void); /* Prototype */
void delay(void);

int main(){
	char x;
	printf("Press Enter to drop the bomb.\n");
	x=getchar();
	dropBomb();
	printf("Key code %d used to drop the bomb.", x);
	return(0);
}

void dropBomb(){
	int x;
	
	for(x=20;x>1;x--){
		puts("       *");
		delay();
	}
	printf("     BOOM!\n");
}

void delay(){
	long int x;

	for(x=0;x<COUNT;x++);

}