#include <stdio.h>

int main(){
	int count = 0;
	
	while(count<100){
		count++;
		if(count%5 == 0)
			continue;
		printf("%d\t", count);
	}
	return(0);
}