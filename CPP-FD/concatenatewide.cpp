// ConcatenateWide - concatenate two wide strings with a "-" in the middle using library routines

#include <iostream>
using namespace std;

int main(int argv, char* args[]){
	// read first string
	wchar_t string1[260];
	cout << "Enter string # 1: " ;
	wcin.getline(string1, 128);
	
	// read the second string
	wchar_t string2[128];
	cout << "Enter string # 2: ";
	wcin.getline(string2, 128);

	// now tack the second onto the end of the first with a dash in between
	wcsncat(string1, L"-", 260);
	wcsncat(string1, string2, 260);
	
	wcout << L"\n" << string1 << endl;
	return 0;
}