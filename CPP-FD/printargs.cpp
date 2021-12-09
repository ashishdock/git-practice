//PrintArgs - write the arguments to the program to the standard output

#include <iostream>

using namespace std;

int main(int argc, char * argv[]){
	// print a warning banner
	cout << "The argument to " << argv[0] << " are: \n" ;
	
	// now write out the remaining arguments
	for (int i=1;i<argc; i++)
		cout << i << ":" << argv[i] << endl;
	
	
	return(0);
}