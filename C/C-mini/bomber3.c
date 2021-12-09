#include <stdio.h>

#define COUNT 20000000 		/* 20,000,000 */

void dropBomb(void);		/* Prototype */
void delay(void);

int deaths;			/* Global variable */
int c=0;

int main(){
	char x;
	
	deaths=0;
	for(;;){
		printf("Press ~ and Enter to quit\n");
		printf("Press Enter to drop the bomb:");
		x=getchar();
		fflush(stdin);
		if (x=='~' && c==1){
			printf("\n\t%d bomb was dropped and %d people were killed.\n\n", c, deaths);
			break;
		}
		if (x=='~' && c>1){
			printf("\n\t%d bombs were dropped and %d people were killed.\n\n", c, deaths);
			break;
		}
		dropBomb();
		printf("%d people killed!\n", deaths);
	}
	return(0);
}

void dropBomb(){
	int x;
	for(x=0;x<20;x++){
		printf("      *\n");
		delay();
	}
	puts("    BOOM!");
	c++;
	deaths+=1500;

}

void delay(){
	long int x;
	for(x=0;x<COUNT;x++);
}