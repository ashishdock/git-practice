#include <stdio.h>
#include <string.h>

int main(){
	struct date{
		int month;
		int day;
		int year;
	};
	
	struct family{
		char name[20];
		struct date birthday;
	} me;
	
/* Fill in your data */
	
	strcpy(me.name, "Dan");
	me.birthday.month = 10;
	me.birthday.day = 19;
	me.birthday.year = 1960;
	
	printf("%s was born on %d/%d/%d.\n",me.name, me.birthday.month, me.birthday.day, me.birthday.year);	
	return(0);
}