// Layout - this program tries to give the reader an idea of the layout of local memory in her compiler

#include <iostream>

using namespace std;

int main(){
	int start;
	int n;
	long l;
	long long ll;
	float f;
	double d;
	long double ld;
	int end;
	
	// set output to hex mode
	cout.setf(ios::hex);
	cout.unsetf(ios::dec);
	
	//output the address of each variable in order to get an idea of how variables are laid out in memory
	
	cout << "--- = " << &start	<< endl;
	cout << "&n  = " << &n		<< endl;
	cout << "&l  = " << &ll		<< endl;
	cout << "&f  = " << &f		<< endl;
	cout << "&d  = " << &d		<< endl;
	cout << "&ld = " << &ld		<< endl;
	cout << "--- = " << &end	<< endl;
	
	return(0);
}