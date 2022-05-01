// Program to compute state income tax.
#include <iostream>
using namespace std;

// This program outputs the amount of state income tax due computed as follows: no tax on income up to $15,000; 5% on income between $15,001 and $25,000; 10% on income over $25,000.

int main()
{
	int net_income;
	double tax_bill;
	double five_percent_tax, ten_percent_tax;
	
	cout << "Enter net income (rounded to whole dollars) $";
	cin >> net_income;
	
	if(net_income<=15000)
		tax_bill = 0;
	else if((net_income>15000) && (net_income<=25000))
		// 5% of amount over $15,000
		tax_bill = (0.05*(net_income-15000));
	else	// net_income < 25,000
	{
		// five percent tax become 5% of 10000 as the income is over 25000
		five_percent_tax = 0.05*10000;
		// ten percent tax become the difference of net income from 25000
		ten_percent_tax = 0.1*(net_income-25000);
		tax_bill = five_percent_tax + ten_percent_tax;
	}
	
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);
	cout.precision(2);
	cout << "Net income = $" << net_income << endl << "Tax bill = $" << tax_bill << endl;
	
	return 0;
}