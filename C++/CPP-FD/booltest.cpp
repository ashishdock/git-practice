// BoolTest - compare variables input from the keyboard and store the results off into a logical variable

#include <cstdio>
#include <cstdlib>
#include <iostream>

using namespace std;

int main(int NumberOfArgs, char* pszArgs[]){
	// set output format for bool variables to true and false instead of 1 and 0.
	cout.setf(cout.boolalpha);
	
	// input two values
	int arg1;
	cout << "Input value 1: ";
	cin >> arg1;

	int arg2;
	cout << "Input value 2: ";
	cin >> arg2;

	// compare the two variables and store the results bool b;
	bool b;
	b = arg1 == arg2;
	
	cout << "The statement, " << arg1 << " equals " << arg2 << " is " << b << "." <<endl;
	
	
	return 0;
}