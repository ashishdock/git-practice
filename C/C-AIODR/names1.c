#include <stdio.h>

int main(){
	char names[4][3][10] = { "Bob", "Bill", "Bret", "Dan", "Dave", "Don", "George", "Harry", "John", "Mike", "Steve", "Vern" };
	
	int a, b;
	
	for(a=0;a<4;a++)
		for(b=0;b<3;b++)
			printf("%s\n", names[a][b]);
	return(0);
}