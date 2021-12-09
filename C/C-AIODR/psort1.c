#include <stdio.h>

#define SIZE 8

int main(){
	char *names[] = { "Mickey", "Minnie", "Donald", "Daisy", "Goofy", "Chip", "Dale", "Pluto" };
	char *temp;
	int x, a, b, c;

	for(a=0;a<SIZE-1;a++)
		for(b=a+1;b<SIZE;b++){
			c=0;
			while(names[a][c]){
			
				if((names[a][c]) > (names[b][c])){
					temp = names[a];
					names[a] = names[b];
					names[b] = temp;
					break;
				}else if((names[a][c]) < (names[b][c]))
					break;
				else c++;
			}
		}
	for(x=0;x<SIZE;x++)
		printf("%s\n", names[x]);
	
	return(0);
}