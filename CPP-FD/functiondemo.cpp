// functiondemo - demostrate the use of functions by breaking the inner loop of the NestedDemo program off into its own function

#include <iostream>

using namespace std;

//displayExplanation - prompt the user as to the rules of the game
void displayExplanation(void){
	cout << "This program sums multiple series\n of numbers. Terminate each sequence\n by entering a negative number.\n"
             << "Terminate the series by entering an\n empty sequence.\n" << endl;
	return;
}

// sumSequence - add a sequence of numbers entered from the keyboard until the user enters a negative number.
// return - the summation of numbers entered.
int sumSequence(void){
	// loop forever
	int accumulator = 0;
	for(;;){
		int value = 0;
		cout << "Enter next number: ";
		cin >> value;
	
		// it it's negative...
		if(value < 0){
			//...then exit from the loop
			break;
		}
		//...otherwise add the number to the
		//accumulator
		accumulator += value;	
	}
	return (accumulator);
}

int main(){
	displayExplanation();
	for(;;){
		//sum a sequence of numbers entered from the keyboard
		cout << "Enter next sequence" << endl;
		int accumulatedValue = sumSequence();
		
		// terminate the loop if sumSequence() returns a zero
		if(accumulatedValue == 0)
			break;
		//now ouput the accumulated result
		cout << endl << "The total is " << accumulatedValue << endl;
	}
	
	return 0;
}