#include <stdio.h>
#include <time.h>

int main(){
	char *wdays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	struct tm *t;
	time_t now;
	
	time(&now);  /* Get the current time */
	t = localtime(&now); /* get the tm structure */
	printf("Today is %s.\n", wdays[t->tm_wday]);
	printf("The day of year is %d\n", t->tm_yday+1);
	printf("The date is %d\n", t->tm_mday);
	printf("The month is %d\n", t->tm_mon+1);
	printf("The year is %d\n", t->tm_year+1900);


	return(0);
}