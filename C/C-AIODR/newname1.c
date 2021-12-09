#include <stdio.h>
#include <errno.h>

int main(){
	int x;

	x = rename("yourname.txt", "zoomba.txt");
	if(x!=0){
		puts("ERROR: ");
		switch(errno){
			case 1:
				printf("Operation not permitted.");
				break;
			case 2:
				printf("No such file.");
				break;
			case 13:
				printf("Permission denied.");
				break;
			case 30:
				printf("Read-only file.");
				break;
			case 63:
				printf("Filename too long!");
				break;
			default:
				printf("Other strange error encountered.");
				break;
		}
		return(1);
	}
	puts("File renamed!");
	return(0);
}