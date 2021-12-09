#include <stdio.h>

int main(){
	char froot[25][14] = { "Apple", "Avocado", "Banana", "Blackberry", "Boysenberry", "Cantaloupe", "Cherry", "Coconut", "Cranberry", "Cumquat", "Grape", "Guava", "Mango", "Marionberry", "Melon", "Orange", "Papaya", "Peach", "Pear", "Persimmon", "Pineapple", "Plum", "Raspberry", "Strawberry", "Watermelon" };

	FILE *f;
	int x;

	if(!(f = fopen("froot.txt", "w"))){
		puts("Error creating file");
		return(1);
	}

	for(x=0;x<25;x++)
		fwrite(froot[x], 14, 1, f);
	fclose(f);
	return(0);
}