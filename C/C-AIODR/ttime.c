#include <stdio.h>
#include <time.h>

int main(){
	struct tm *t;
	time_t now;
	
	time(&now); /* get the current time */
	t = localtime(&now); /* get the tm structure */
	printf("%d    %s\n", t, t);
	printf("It is now %d:%02d:%02d\n", t->tm_hour, t->tm_min, t->tm_sec);
	return(0);
}