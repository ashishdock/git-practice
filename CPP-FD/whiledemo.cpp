// WhileDemo - input a loop count. Loop while ouputting a string arg number of times.

#include <iostream>

using namespace std;

int main(){
	int loop = 10;
	
	while(loop > 0){
		loop = loop-1;
		cout << "Only " << loop << " loops to go" << endl;
	}
	
	return(0);
}