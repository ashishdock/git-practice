//Savings - define a class that includes the ability to make a deposit

class Savings{
	public:
	// define a member function deposit()
	double deposit(double amount){
		balance += amount;
		return balance;
	}
	unsigned int accountNumber;
	double balance;
};