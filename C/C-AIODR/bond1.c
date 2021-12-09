#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	struct jb{
		char actor[25];
		struct jb *next;
	};
	
	struct jb *first_item;
	struct jb *current_item;
	struct jb *new_item;
	
	struct jb *bond;

/* Create the first structure in the list */	
	first_item = (struct jb *)malloc(sizeof(struct jb));

/* Fill the first structure */
	strcpy(first_item->actor, "Sean Connery");
	new_item = (struct jb *)malloc(sizeof(struct jb));
	first_item->next = new_item;

/* Fill the second structure */
	current_item = new_item;   /*  New item will always remain blank for next and this assignment will continue  */
	strcpy(current_item->actor, "David Niven");
	current_item->next = NULL;   /* End of list */

/* Display the results */
	printf("The first structure: \n");
	printf("\tfirst_item->actor = %s\n", first_item->actor);
	printf("\tnext structure address = %p\n", first_item->next);

	printf("The second structure: \n");
	printf("\tcurrent_item->actor = %s\n", current_item->actor);
	printf("\tnext structure address = %p\n", current_item->next);

	return(0);
}