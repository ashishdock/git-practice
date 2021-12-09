// DisplayString - display an array of characters both using a pointer and an array index

#include <iostream>

using namespace std;

int main(){
	// declare a string
	const char* szString = "Randy";
	cout << "The array is '" << szString << "'" << endl;
	
	// display szString as an array
	cout << "Display the string as an array: ";
	for(int i=0;i<5;i++)
		cout << szString[i];
	cout << endl;
	
	// now using typical pointer arithmetic 
	cout << "Display string using a pointer: ";
	const char* pszString = szString;  /* Can directly use szString, right??? */
	while(*pszString){
		cout << *pszString;
		pszString++;
	}
	cout << endl;
	
	return(0);
}