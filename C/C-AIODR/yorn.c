#include <stdio.h>

int main(){
	char ch;

	printf("Would you like me to send your password to the bad guys?\n");
	printf("Enter Y or N (Y/N):");
	for(;;)
	{	ch = getchar();
		if(ch == 'N' || ch == 'n'){
			printf("Well, then: your password is safe!\n");
			break;
		}
		else if(ch == 'Y' || ch == 'y'){
			printf("Okay. Sending your password!\n");
			break;
		}
		else
			printf("You must enter correct choice: Y or N.");
			fflush(stdin);
	}
	return(0);
}