// Conversion - Program to convert temperature from Celsius degrees into Fahrenheit:
//              Fahrenheit = Celcius * (212 - 32)/100 + 32

#include <cstdio>
#include <cstdlib>
#include <iostream>

using namespace std;

int main(int numberofArgs, char *args[]){

	//enter the temperature in Celcius
	int celcius;
	cout << "Enter the temperature in Celcius: ";
	cin >> celcius;
	
	// Calculate conversion factor for Celcius to Fahrenheit
	int factor;
	factor = 212-32;

	//use conversion factor to convert Celcius into Fahrenheit
	int fahrenheit;
	fahrenheit = factor * celcius/100 +32;

	//output the results (followed by a NewLine)
	cout << "Fahrenheit value is: ";
	cout << fahrenheit << endl;
	
	// wait until user is ready before terminating program to allow the user to see the program results
	cout << "Press Enter to continue..." << endl;
	cin.ignore(10, '\n');
	cin.get();
	return 0;
}
