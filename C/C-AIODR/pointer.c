#include <stdio.h>
#include <stdlib.h>

int main(){

	int x = 99;
	int *pt1;
	pt1 = &x;

	printf("Value at p1: %d\n", *pt1);
	printf("Address of p1: %p\n", pt1);
	printf("Address of p1: %p\n", (void*)pt1);



/* NONE OF THE BELOW WILL WORK 
	int a, b; 
	int *p; *p = 25;

	printf("%x\n", p);
	printf("%p\n", p); 
	printf("%d\n", *p);


	int *a;
	*a = 13;
	printf("*a is %p:\n", &*a); 
 	printf("a is %d\n", a); 
	printf("a is %p\n", (void *)a);  */
	return(0);
}

