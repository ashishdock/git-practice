// BreakDemo - input a series of numbers. Continue to accumulate the sum of these numbers untill the user enters a negative number.

#include <iostream>

using namespace std;

int main(){
	// input the loop count
	int accumulator = 0;

	cout << "This program sums values from the user\n" << "Terminate by entering a negative number" << endl;

	//loop forever
	
	for(;;){
		// fetch another number
		int value = 0;
		cout << "Enter next number: ";
		cin >> value;
		
		// if it's negative
		if(value < 0) // then exit
			break;
		// otherwise add number to the accumulator
		accumulator += value;
	}
	
	// now that we've exited the loop output the accumulated number
	cout << "\nThe Total is " << accumulator << endl;
	return 0;
}

