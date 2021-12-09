#include <stdio.h>

int main(){
	int x;

	x = rename("yourname.txt", "zoomba.txt");
	if(x!=0){
		puts("Some kind of error renaming the file!");
		return(1);
	}
	puts("File renamed!");
	return(0);
}