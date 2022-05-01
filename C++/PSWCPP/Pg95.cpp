#include <iostream>
using namespace std;

int main()
{
	char symbol1, symbol2, symbol3;
	
	cout << "Enter two initals, without any periods:\n";
	cin >> symbol1 >> symbol2;
	cout << "The two intials are:\n";
	cout << symbol1 << symbol2 << endl;
	cout << "Once more with a space:\n";
	symbol3 = ' ';
	cout << symbol1 << symbol3 << symbol2 << endl;
	cout << "That's all";
	
	return 0;
}