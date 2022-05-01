//SavingsClassInline - invoke a member function that's both declared and defined within the class Student

#include <iostream>
#include "savings.h"

using namespace std;

int main(){
	Savings s;
	s.accountNumber = 123456;
	s.balance = 0.0;
	
	// now add something to the account
	cout << "Depositing 10 to account " << s.accountNumber << endl;
	s.deposit(10);
	cout << "Balance is " << s.balance << endl;

	
	return 0;
}