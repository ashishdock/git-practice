// SquareDemo - demonstrate the use of a function which processes arguments

#include <iostream>

using namespace std;

// square - returns the square of its argument
double square(double Var){
	return Var*Var;
}

// displayExplanation - prompt the user as to the rules of the game
void displayExplanation(void){
	cout <<"This program sums the square of multiple\nseries of numbers. Terminate each sequence\n"
	<< "by Entering a negative number.\nTerminate the series by entering an\nempty sequence.\n" << endl;	
	return;
}

// sumSquareSequence - accumulate the square of the number entered at the keyboard into a sequence
// until the user enters a negative number
double sumSquareSequence(void){
	// loop forever
	double accumulator = 0.0;
	for(;;){
		// fetch another number
		double value = 0.0;
		cout << "Enter next number: ";
		cin >> value;
		
		// if it's negative
		if(value < 0)
			break;
		value = square(value);
		accumulator += value;
	}
	return accumulator;
}

int main(){
	displayExplanation();
	
	//Continue to accumulate numbers
	for(;;){
		// sum a sequence of numbers entered from
		// the keyboard
		cout << "Enter next sequence" << endl;
		double accumulatedValue = sumSquareSequence();
	
		// terminate if the sequence is zero or negative
		if (accumulatedValue <= 0.0)
			break;
		
		// now output the accumulated result
		cout <<"\nThe total of the values squared is "
		     << accumulatedValue << endl << endl;
	}
	return 0;
}