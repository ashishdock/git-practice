//BitTest - initialize two variables and output the results of applying the ~, &, | and ^ operations.

#include <cstdio>
#include <cstdlib>
#include <iostream>

using namespace std;

int main(int args, char* argv[]){
	// set output format to hexadecimal
	cout.unsetf(cout.dec);
	cout.setf(cout.hex);

	// initialize two arguments
	int arg1 = 0x78ABCDEF;
	int arg2 = 0x12345678;
	
	// now perform each operation in turn, first the unary NOT operator
	cout << "arg1 = 0x" << arg1 << endl;
	cout << "~arg1 = 0x" << ~arg1 << "\n" << endl;
	cout << "arg2 = 0x" << arg2 << endl;
	cout << "~arg2 = 0x" << ~arg2 << "\n" << endl;

	// now the binary operators
	cout << "  0x" << arg1 << "\n"
	     << "& 0x" << arg2 << "\n"
	     << "-------------"<< "\n"
	     << "  0x" << (arg1 & arg2) << "\n"
	     << endl;

	cout << "  0x" << arg1 << "\n"
	     << "| 0x" << arg2 << "\n"
	     << "-------------"<< "\n"
	     << "| 0x" << (arg1 | arg2) << "\n"
	     << endl;

	cout << "  0x" << arg1 << "\n"
	     << "^ 0x" << arg2 << "\n"
	     << "-------------"<< "\n"
	     << "  0x" << (arg1 ^ arg2) << "\n"
	     << endl;
	
	return 0;
}