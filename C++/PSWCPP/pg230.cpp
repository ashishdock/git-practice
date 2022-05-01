// Determines user's grade. Grades are Pass or Fail.
#include <iostream>
using namespace std;

char grade(int received_par, int min_score_par);
// Returns 'P' for passing, if received_par is
// min_score_par or higher. Otherwise returns 'F' for failing.

int main()
{
	int score, need_to_pass;
	char letter_grade;
	
	cout << "Enter your score" << " and the minimum needed to pass:\n";
	cin >> score >> need_to_pass;
	
	letter_grade = grade(score, need_to_pass);
	cout << "You received a score of " << score << endl << "Minimum to pass is " << need_to_pass << endl;
	
	if(letter_grade == 'P')
		cout << "You passed. Congratulations!\n";
	else
		cout << "Sorry. You failed.\n";
	
	cout << letter_grade << " will be entered in your record.\n";
	
	return 0;
}

char grade(int received_par, int min_score_par)
{
	if(received_par >= min_score_par)
		return 'P';
	else
		return 'F';
}