#include <iostream>
using namespace std;

int main()
{
	char ans;
	
	do
	{
		cout << "Hello\n";
		cout << "Do you want another greeting? \n" << "Press y for Yes, n for No, \n" << "and then press return: " ;
		cin >> ans;
	}
	while(ans == 'y' || ans == 'Y');
	
	cout << "GoodBye!";
	return 0;
}