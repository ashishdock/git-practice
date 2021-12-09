#include <stdio.h>
#include <string.h>

int main(){
	struct person{
		char name[50];
		int age;
		union{
			struct{
				char game[25];
				int jersey_number;
			} sports;
			struct{
				char instrument[25];
				int years_practice;
			} music;
			struct{
				int hours_week;
			} television;
		} hobby;
	};
	
	struct person a;
	struct person b;
	struct person c;

	strcpy(a.name, "Alex");
	a.age = 17;
	strcpy(a.hobby.music.instrument, "Guitar");
	a.hobby.music.years_practice = 4;

	strcpy(b.name, "Jerry");
	b.age = 22;
	strcpy(b.hobby.sports.game ,"Football");
	b.hobby.sports.jersey_number = 66;

	strcpy(c.name, "April");
	c.age = 37;
	c.hobby.television.hours_week = 60;
	
	printf("Person A is %s, who is %d years old.\n", a.name, a.age);
	printf("A has played %s for %d years.\n\n", a.hobby.music.instrument, a.hobby.music.years_practice);
	printf("Person B is %s who is %d years old.\n", b.name, b.age);	
	printf("B has played %s and is number %d.\n\n", b.hobby.sports.game, b.hobby.sports.jersey_number);
	printf("Person C is %s, who is %d years old.\n", c.name, c.age);
	printf("C watches TV %d hours a week.\n\n", c.hobby.television.hours_week);

	return(0);
}