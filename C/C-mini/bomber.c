#include <stdio.h>
#include <unistd.h>

void dropBomb(void);  /* Prototype */

int main(){
	printf("Press Enter to drop the bomb: ");
	getchar();
	dropBomb();
	printf("Yikes!\n");
	return(0);
}

void dropBomb(){
	int x;

	for(x=20;x>1;x--){
		puts("        *");
		sleep(0.5);
	}
	puts("      BOOM!");
}