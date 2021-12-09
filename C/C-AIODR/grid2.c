#include <stdio.h>

int main(){
	int x = 1;
	char a;

	while(x < 10){
		a = 'A';
		while(a < 'J'){
			printf("%d%c\t", x, a);
			a++;
			if(x==5 && a == 'F') goto label;
		}
		putchar('\n');
		x++;
	}
	label:
	return(0);
}