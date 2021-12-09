// SavingsClassOutline - invoke a member function that's declared within a class but defined in a separate file

#include <iostream>
#include "savingsout.h"

using namespace std;

// define the member function Savings::deposit()
// normally this is contained in a separate file that is then combined with a another file

double Savings::deposit(double amount){
	balance += amount;
	return balance;
}

int main(){
	Savings s;
	s.accountNumber = 123456;
	s.balance = 0.0;
	
	// now add something to the account
	cout << "Depositing 10 to account " << s.accountNumber << endl;
	s.deposit(10);
	cout << "The balance is " << s.balance << endl;
	
	
	return 0;
}