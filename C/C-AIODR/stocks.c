#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define FALSE 0
#define TRUE !FALSE

struct stock_data{
	char name[30];
	float buy_price;
	float current_price;
};

void write_info(void);
void read_info(void);
void replace_info(void);

int main(){
	char c;
	int done=FALSE;
	
	while(!done)
	{
		puts("\nStock Portfolio Thing\n");
		puts("A - Add new stock\n");
		puts("R - Replace stock\n");
		puts("L - List stocks\n");
		puts("Q - Quit\n");
		printf("Your choice: ");
		
		c=getchar();
		fflush(stdin);
		switch (toupper(c)){
			case 'A':
				puts("Add new stock\n");
				write_info();
				break;
			case 'L':
				puts("Listing all stocks\n");
				read_info();
				break;
			case 'R':
				puts("Replace stock\n");
				replace_info();
				break;
			case 'Q':
				return(0);
			default:
				puts("?");
				break;
		}
	}
	return(0);
}

void write_info(void){
	FILE *stockfile;
	struct stock_data stock;
	
	printf("Enter stock name: ");
	gets(stock.name);
	printf("How much did you pay for it? $");
	scanf("%f", &stock.buy_price);
	stock.current_price = stock.buy_price/11;

	stockfile = fopen("stockdata.dat", "a");
	if(stockfile == NULL){
		puts("Error updating stocks database!");
		exit(1);
	}
	fwrite(&stock, sizeof(stock),1,stockfile);
	
	fclose(stockfile);
	puts("Stock added!");
	fflush(stdin);
}

void read_info(void){
	FILE *stockfile;
	struct stock_data stock;
	int x;
	
	stockfile = fopen("stockdata.dat", "r");
	if(stockfile == NULL){
		puts("Error retrieving data from database!");
		return;
	}
	
	while(TRUE){
		x = fread(&stock, sizeof(stock), 1, stockfile);
		
		if(x == 0) break;
		
		printf("\nStock name: %s\n", stock.name);
		printf("Purchased for: $%.2f\n", stock.buy_price);
		printf("Current price: $%.2f\n", stock.current_price);
	
	}
	fclose(stockfile);
}

void replace_info(void){
	FILE *stockfile;
	struct stock_data stock;
	int record, x;
	long offset;
	
	printf("Which record number do you want to find? ");
	scanf("%d", &record);

	stockfile = fopen("stockdata.dat", "r+");
	if(stockfile == NULL){
		puts("Error opening file!\n");
		return;
	}
/* In reality and so in this example, offset should be long as databases tend to contain thousands or more entries */
	offset = (long)(record-1)*sizeof(stock);
	x = fseek(stockfile, offset, SEEK_SET); /* fseek returns 0 is successful and -1 or anything if failure */
	if(x!=0){
		puts("Error reading from file!\n");
		return;
	}
	
	x = fread(&stock, sizeof(stock), 1, stockfile);
	if(x==0)
	{
		puts("Error reading record!\n");
		return;
	}
	
	printf("\nRecord: %d\n", record);
	printf("Stock name: %s\n", stock.name);
	printf("Purchased for $%.2f\n", stock.buy_price);
	printf("Current price: $%.2f\n", stock.current_price);
	fclose(stockfile);
	fflush(stdin);
}