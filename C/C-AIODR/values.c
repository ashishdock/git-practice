#include <stdio.h>

void a(void){
	int a; a = 5;
}

void b(void){
	int b;
	printf("B is %d", b);
}

int main(){
	a();
	b();
	return(0);
}