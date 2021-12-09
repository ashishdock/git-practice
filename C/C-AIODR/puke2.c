#include <stdio.h>

void peasoup(int *green);

int main(){
	int *head, turn;

	turn = 13;
	head= &turn;
	peasoup(head);
	printf("The new value of variable is %d.\n",*head);
	printf("Turn is %d.\n", turn);
	printf("Turn lives at address %p.\n", &turn);
	printf("Head lives at %p. \n", head);
	printf("This proves that pointer is an address value of a variable and is not a variable in itself. You cannot assign value to a value at pointer variable. Pointer variable can only be assigned an address value of another variable which contains a value.");
	printf("\n\n Moreover, when the value of variable is changed in the function, it is changed in the entirety of the program not just locally. This is the power/advantage of using pointers.\n");
	return(0);
}

void peasoup(int *green){
	while((*green)--)
		puts("Blech!");
	*green = 900+100-1*1;
}