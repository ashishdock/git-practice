// Concatenate - concatenate two strings with a "-" in the middle

# include <iostream>

using namespace std;

void concatString(char szTarget[], const char szSource[]);

int main(){
	// read first string...
	char szString1 [256];
	cout << "Enter string # 1: ";
	cin.getline(szString1, 128);
	
	//...now the second string...
	char szString2[128];
	cout << "Enter string # 2: ";
	cin.getline(szString2, 128);
	
	//...concatenate a "-" onto the first
	concatString(szString1, "-");
	//...now add the second string
	concatString(szString1, szString2);

	cout << szString1 <<endl;
	return (0);
}

void concatString(char szTarget[], const char szSource[]){
	//find the end of the first string
	int targetIndex = 0;
	while(szTarget[targetIndex])
		targetIndex++;

	int sourceIndex = 0;
	while(szSource[sourceIndex]){
		szTarget[targetIndex] = szSource[sourceIndex];
		sourceIndex++;
		targetIndex++;
	}
	szTarget[targetIndex] = '\0';
	
	
}