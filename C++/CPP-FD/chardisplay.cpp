// CharDisplay - output a character array to standard output, the MS-DOS window

#include <iostream>

using namespace std;

//prototype declarations
void displayCharArray(char charArray[], int sizeOfArray);

int main(){
	char charMyName[] = { 'S', 't', 'e', 'p', 'h', 'e', 'n' };
	displayCharArray(charMyName, 7);
	cout << endl;	
	return 0;
}

void displayCharArray(char charArray[], int sizeOfArray){
	for(int i=0; i<sizeOfArray;i++)
		cout << charArray[i];
	cout << endl;
}