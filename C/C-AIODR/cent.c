#include <stdio.h>

int main(){
	int cent[8];
	int x;

	for(x=0;x<8;x++){
		cent[x] = (x+1) * 100;
		printf("cent[%d] = %d\n", x, cent[x]);
	}
	return(0);
}