// DisplayString - output a character array to standard output, the MS-DOS window

#include <iostream>
using namespace std;

void displayString(char stringArray[]);

int main(int argv, char* args[]){
	char charMyName[] = { 'S', 't', 'e', 'p', 'h', 'e', 'n' };
	displayString(charMyName);
	cout << endl;
	
	return 0;
}

void displayString(char stringArray[]){
	for(int i=0;stringArray[i] != 0; i++)
		cout << stringArray[i];
	cout << endl ;
}