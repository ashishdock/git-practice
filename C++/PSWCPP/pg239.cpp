// Determines the total number of green-necked vulture eggs counted by all conservationists in the conservation district.
#include <iostream>
using namespace std;

int get_one_total();
// Precondition: Use will enter a list of egg counts followed by a negative number
// Postcondition: returns a number equal to the sum of all the egg counts.

int main()
{
	cout << "This program tallies conservationists reports on the green-necked vulture.\n" 
		 << "Each conservationist's report consists of a list of numbers. Each number is the count of \n"
		 << "the eggs observed in one green-necked vulture next.\n"
		 << "This program than tallies the total number of eggs.\n";
		 
		 int number_of_reports;
		 cout << "How many conservationist reports are there? ";
		 cin >> number_of_reports;
		 
		 int grand_total=0, subtotal, count;
		 for(count=1; count <=number_of_reports; count ++)
		 {
		 	cout << endl << "Enter the report of conservationst number "<< count << endl;
		 	subtotal = get_one_total();
		 	cout << "Total egg count for conservationist number " << count << " is " << subtotal << endl;
		 	grand_total = grand_total + subtotal;
		 }
		 
		 cout << endl << "Total egg count for all reports = " << grand_total << endl;
		 
		 return 0;
}

// Uses iostream
int get_one_total()
{
	int total;
	cout << "Enter the number of eggs in each nest.\n" << "Place a negative integer at the end of your list.\n" ;
	total = 0;
	int next;
	cin >> next;
	while(next>=0)
	{
		total = total + next;
		cin >> next;
	}
	return total;
}