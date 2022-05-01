#include <iostream>
using namespace std;

int main()
{
	int count_down;
	cout << "How many greetings do you want?";
	cin >> count_down;
	
	while(count_down>0)
	{
		cout << "Hello " << count_down << endl;
		count_down--;
	}
	
	cout << endl;
	cout << "That's all";
}