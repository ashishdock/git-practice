#include <stdio.h>
#include <time.h>

int main(){
	time_t now, t;
	
	time(&now);
	printf("It is now %d\n", now);
	
	t=time(NULL);
	printf("It is now %d\n", t);
	time(&t);
	printf("It is now %d\n", t);
	printf("It is now %s\n", ctime(&now));
	return(0);
}