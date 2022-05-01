// PassObjVal - attempts to change the value of an object in a function fail when the object is passed by value

#include <iostream>

using namespace std;

class Student{
	public:
		int semesterHours;
		double gpa;
};

void someFn(Student copyS){
	copyS.semesterHours = 10;
	copyS.gpa = 3.0;
	cout << "The value of copyS.gpa = " << copyS.gpa << endl;
};

int main(){
	Student s;
	s.gpa = 0.0;

	// display the value of s.gpa before calling someFn()
	cout << "The value of s.gpa = " << s.gpa << endl;

	// pass the address of the existing object
	cout << "Calling someFn(Student)" << endl;
	someFn(s);
	cout << "Returned from someFn(Student)" << endl;
	
	// the value of s.gpa remains 0
	cout << "The value of s.gpa = " << s.gpa << endl;
	return 0;
}