#include <stdio.h>

int main(){
	struct month{
		char name[16];
		int age;
		char likes[64];
		char dislikes[64];
		float iq;
	};
	
	struct month march = {"Kelly", 23, "Books, scented candles, macrame, handguns", "Bureaucrats, locked doors, guys named Milton", 139.8};
	
	puts("Mensa Playmate of the Month Data");
	printf("%9s %s\n", "Name:", march.name);
	printf("%9s %d\n", "Age:", march.age);
	printf("%9s %s\n", "Likes:", march.likes);
	printf("%9s %s\n", "Dislikes:", march.dislikes);
	printf("%9s %.2f\n", "IQ:", march.iq);
	return(0);
}