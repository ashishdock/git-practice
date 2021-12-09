#include <stdio.h>

int main(){
	char phrase[] = "sushi is mooshi";
	char ch;
	int x = 0;

	do{
		ch = phrase[x];
		putchar(ch);
		x++;
	} while(ch!='\0');
	putchar('\n');	

/* Another variation */
	x=0;
	while(ch = phrase [x]){
		putchar(ch);
		x++;
}
	putchar('\n');

/* Another variation */
	puts(phrase);
	phrase[9]='s';
	puts(phrase);
	return(0);
}

