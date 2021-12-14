//Student class using inheritance 
class Student extends Teacher 
{
	//since id, name, address are available from Teacher class, we omit
	//those instance variables and the corresponding methods.
	
	int marks;
	
	//to store marks
	void setMarks(int marks)
	{
		this.marks = marks;
	}
	
	//to retrieve marks
	int getMarks()
	{
		return marks;
	}
}