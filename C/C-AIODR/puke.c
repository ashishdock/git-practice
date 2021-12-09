#include <stdio.h>

void peasoup(int green);

int main(){
	int turn;
	
	turn = 13;
	peasoup(turn);
	return(0);
}

void peasoup(int green){
	while(green--)
		puts("Blech!");
}