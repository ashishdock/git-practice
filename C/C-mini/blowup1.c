#include <stdio.h>

int main(){
	char c;
	
	printf("Would you like your computer to explode?\n");
	c=getchar();
	if(c=='Y' || c=='y'){
		printf("OK: Configuring computer to explode now.\n");
		printf("Bye!\n");
	}

	else if(c=='N' || c=='n'){
		printf("Okay. Whew! That was a close one.");
	}
	else {
		printf("Invalid option.");
	}
	return(0);
}