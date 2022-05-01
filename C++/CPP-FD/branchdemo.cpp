// BranchDemo - input two numbers. Go down one path of the program if the first argument is greater
// than the first or the other path if not.

#include <iostream>

using namespace std;

int main(){
	// input the first argument...
	int arg1;
	cout << "Enter arg1: ";
	cin >> arg1;
	
	//... and the second
	int arg2;
	cout << "Enter arg2: ";
	cin >> arg2;
	
	//now decide what to do
	if (arg1 > arg2)
		cout << "Argument 1 is greater than Argument 2." << endl;
	else if (arg1 == arg2)
		cout << "Argument 1 and Argument 2 are equal." << endl;
	else
		cout << "Argument 2 is greater than argument 1." << endl;
	
	return 0;
}