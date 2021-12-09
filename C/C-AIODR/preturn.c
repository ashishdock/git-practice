#include <stdio.h>

int *greatest(int a, int b, int c);

int main(){
	int *p;
	
	p = greatest(5, 25, 16);
	printf("The greatest value is %d\n", *p);
	return(0);
}

int *greatest(int a, int b, int c){
	int *g;

	if(a>b && a>c) g = &a;
	if(b>a && b>c) g = &b;
	else g = &c;
	return(g); 
/* Interestingly enough, this function returns g even without the ending return statement. That's because, in absence of a return statement, the value of last variable in last statement is returned.*/
}