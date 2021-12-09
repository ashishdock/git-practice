#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define RECORDS 6

int main(){
	struct jb {
		char actor[25];
		struct jb *next;
	};
	
	struct jb *first_item; /* Any data struct defined as first_item is constant, the current item will keep on changing but the elements in first_item will remain named as first_item and with the help of next pointer the whole chain of data structures is retrieved. */
	struct jb *current_item;
	struct jb *new_item;
	int index = 0;;

	char *bonds[RECORDS] = { "Sean Connery", "David Niven", "George Lazenby", "Roger Moore", "Timothy Dalton", "Pierce Brosnan" };
	
/* Create the first structure in the list */
	first_item = (struct jb *)malloc(sizeof(struct jb));
	current_item = first_item;

/* Fill the structures */
	while(1){
		strcpy(current_item->actor, bonds[index]);
		index ++;
		if(index < RECORDS){
			new_item = (struct jb*)malloc(sizeof(struct jb));
			current_item->next = new_item;
			current_item = new_item;
		}
		if(index == RECORDS){
			current_item->next = NULL;
			break;
		}
	}

/* Display the results */
	current_item = first_item;  /* start over */
	index = 1;
	while(current_item){
		printf("Structure %d: ", index++);
		printf("%s\n", current_item->actor);
		current_item = current_item->next;
	}
	return(0);
}