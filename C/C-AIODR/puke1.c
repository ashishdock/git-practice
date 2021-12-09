#include <stdio.h>


void peasoup(int green);

int main(){
	int *head, turn;

	turn = 13;
	head= &turn;
	peasoup(*head);
	return(0);
}

void peasoup(int green){
	while(green--)
		puts("Blech!");
}