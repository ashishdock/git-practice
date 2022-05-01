// NestedDemo - input a series of numbers. Continue to accumulate the sum of these numbers
// until the user enters a 0. Repeat the process until the sum is 0.

#include <iostream>

using namespace std;

int main(){
	// the outer loop
	cout << "This program sums multiple series\n of numbers. Terminate each sequence\n"
	     << "by entering a negative number.\n Terminate the series by entering two\n negative numbers in a row.\n";
	
	// continue to accumulate sequences
	int accumulator;
	for(;;){
		// start entering the next sequence
		// of numbers
		accumulator = 0;
		cout << "Start the next sequence\n";
		//fetch another number
		int value = 0;		
		cout << "Enter a number: ";
		cin >> value;
		accumulator += value;
		//loop forever
		for(;;){
			cout << "Enter next number: ";
			cin >> value;
			if (value < 0)
				break;
			accumulator += value;
		}
		if(accumulator == 0)
			break;
	}
	// output the accumulated result 
	cout << "The total for this sequence is " << accumulator << endl;
	
	return 0;
}