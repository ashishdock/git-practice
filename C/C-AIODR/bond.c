#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	struct jb{
		char actor[25];
		struct jb* next;
	};
	struct jb *bond;

/*  Create the first structure in the list  */
	bond = (struct jb *)malloc(sizeof(struct jb));

/* Fill the structure */
	strcpy(bond->actor, "Sean Connery");
	bond->next = NULL;  /* End of list */
	
/* Display the results */
	printf("The first structure has been created: \n");
	printf("\tbond->actor = %s\n", bond->actor);
	printf("\tnext structure address %p\n", bond->next);

	return(0);
}