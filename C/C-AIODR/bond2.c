#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define RECORDS 6

int main(){
	struct jb{
		char actor[25];
		struct jb *next;
	};
	
	struct jb *first_item;
	struct jb *current_item;
	struct jb *new_item;
	int index = 0;
		
	char *bonds[RECORDS] = { "Sean Connery", "David Niven", "George Lazenby", "Roger Moore", "Timothy Dalton", "Pierce Brosnan" };
	
/* Create the first structure in the list */	
	first_item = (struct jb *)malloc(sizeof(struct jb));
	current_item = first_item;

/* Fill the structures */
	while(index < RECORDS){
		strcpy(current_item->actor, bonds[index]);
		new_item = (struct jb *)malloc(sizeof(struct jb));
		current_item->next = new_item;
/* The above part is actually stored at first_item and now we assign the current_item to new item address */		
		current_item = new_item;
		index++;
	}

/* Display the results */
	
	
	return(0);
}