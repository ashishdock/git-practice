#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void clearInput(void);
void addNewAccount(void);
void deleteAccount(void);
void modifyAccount(void);
void listAll(void);
int prompt(void);

struct account{
	int number;
	char lastname[15];
	char firstname[15];
	float balance;
	struct account *next;
};	
struct account *firsta, *currenta, *newa;
int anum = 0;

int main(){
	char ch;
	firsta = NULL;
	FILE *datafile;
	char *filename = "bank.dat";
	
	datafile = fopen(filename, "a+");
	if(datafile){
		firsta = (struct account *)malloc(sizeof(struct account));
		currenta = firsta;
		while(1){
			newa = (struct account *)malloc(sizeof(struct account));
			fread(currenta, sizeof(struct account), 1, datafile);
			if(currenta->next == NULL)
				break;
			currenta->next = newa;
			currenta = newa;
		}
		fclose(datafile);
		anum = currenta->number;
	}
	
	do{
		clearInput();
		puts("\nA - Add a new account");
		puts("D - Delete Account");
		puts("L - List all accounts");
		puts("M - Modify account");
		puts("Q - Quit this program");
		printf("\tYour choice: ");	
		ch = toupper(getchar());
		
		switch(ch){
			case 'A':
				puts("Add new account\n");
				clearInput();
				addNewAccount();
				break;
			case 'D':
				puts("Delete existing account\n");
				clearInput();
				deleteAccount();
				break;
			case 'L':
				puts("Listing all accounts\n");
				listAll();
				break;
			case 'M':
				puts("Modify all accounts\n");
				modifyAccount();
				break;
			case 'Q':
				puts("Quit\n");
			default:
				break;
		}	
	}
	while(ch!='Q');

/* Save  the records to disk */
	currenta = firsta;
	if(currenta == NULL)
		return(0);  /* no data to write END OF PROGRAM */

	datafile = fopen(filename, "a+");
	if(datafile == NULL){
		printf("Error writing to %s!\n", filename);
		return(1);
	}
	
	/* Write each record to disk */
	while(currenta != NULL){
		fwrite(currenta, sizeof(struct account), 1, datafile);
		currenta = currenta->next;
	}
	fclose(datafile);
	return (0);
}

/* This function clears any text from the input stream*/

void clearInput(void){
	fflush(stdin);
}

void addNewAccount(void){
	newa = (struct account *)malloc(sizeof(struct account));

	/* Check to see if this is the first record. If so, then initialize all the pointers to this first structure
	 in the database */
	if(firsta == NULL)
		firsta = currenta = newa;
		
	/* Otherwise, you must find the end of the structure list (easily spotted by the NULL pointer) and add on the
	 new structure you just allocated memory for */	
	else {
		currenta = firsta;  /* make first record current */
	
	
	/* loop through all records */
		while(currenta->next != NULL)
			currenta = currenta->next;
	
	/* the last record is found */	
		currenta->next = newa;
		currenta = newa;

	}

/* Now, just fill in the new structure */
	anum++;
	currenta->number = anum;
	printf("%27s: %5i\n", "Account number", anum );
	printf("%27s: ","Enter customer's last name");
	gets(currenta->lastname);
	printf("%27s: ", "Enter customer's first name");
	gets(currenta->firstname);
	printf("%27s: $", "Enter account balance");
	scanf("%f", &currenta->balance);


/* Finally, cap the new record with a NULL pointer so that you know it's the last record: */
	currenta->next = NULL;	

}

void deleteAccount(void){
	int record;
	struct account *previousa;
	
	if(firsta == NULL){
		puts("There are no records to delete!");
		return;
	}
	
/*	listall(); show all records first */
	printf("Enter account number to delete: ");
	scanf("%d", &record);
	
	currenta = firsta;
	while(currenta != NULL){
		if(currenta->number == record){
			if(currenta == firsta) /* special condition */
				firsta = currenta->next;
			else
				previousa->next = currenta->next;
			free(currenta);
			printf("Account %d deleted!\n", record);
			return;
		}
		else{
			previousa = currenta;
			currenta = currenta->next;
		}
	}
	printf("Account %d was not found!\n", record);
	puts("Nothing deleted.");
}

void listAll(void){
	if(firsta == NULL)
		puts("There are no records to show.");
	else{
		currenta = firsta;  /* make first record current */
		/* loop through all records */
		printf("%6s %-15s %-15s %11s\n", "Acct#", "Last", "First", "Balance");
		while((currenta = currenta->next) != NULL)
			printf("%5d: %-15s %-15s $%8.2f\n", currenta->number, currenta->lastname, currenta->firstname, currenta->number);
		
	}
}

void modifyAccount(void){
	int record;
	if(firsta == NULL){
		puts("There are no records to modify!");
		return;
	}
	
	listAll();   /* show all records first */
	printf("Enter account number to modify or change: ");
	scanf("%d", &record);

	currenta = firsta;
	while(currenta != NULL){
		if(currenta->number == record){
			printf("Account # %d:\n", currenta->number);
			printf("Last name: %s\n", currenta->lastname);
			if(prompt())
				gets(currenta->lastname);
			printf("First name: %s\n", currenta->firstname);
			if(prompt())
				gets(currenta->firstname);
			printf("Balance %8.2f\n", currenta->balance);
			if(prompt())
				scanf("%f", &currenta->balance);
			return;
		}
		else {
			currenta = currenta->next;
		}
	}
	printf("Account %d was not found!\n", record);
}

int prompt(void){
	char ch;
	clearInput();
	printf("Update?");
	ch = getchar();
	ch = toupper(ch);
	clearInput();
	if(ch == 'Y'){
		printf("Enter new: ");
		return(1);
	}
	else
		return(0);
}