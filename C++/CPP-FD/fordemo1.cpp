// ForDemo1 - input a loop count. Loop while ouputting a string arg number of times.

#include <iostream>

using namespace std;

int main(){
	int loop = 10;
	
	for(;loop>0;loop--){
		cout << "We've finished " << 11 - loop << " loops. " << loop - 1 << " more loops to go." <<endl;
	}
	
	return 0;
}