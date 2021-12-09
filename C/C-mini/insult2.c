#include <stdio.h>

int main(){
	char jerk[20];

	puts("Name some jerk you know: ");
	gets(jerk);
	printf("Yeah, I think %s is a jerk, too.", jerk);
	return(0);
}