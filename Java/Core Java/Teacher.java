//Teacher class
class Teacher
{
	//instance variables 
	int id;
	String name;
	String address;
	float sal;
	
	//setter method to store id
	void setId(int id)
	{
		this.id = id;
	}
	
	//getter method to retrieve id
	int getId()
	{
		return id;
	}
	
	//to store name
	void setName(String name)
	{
		this.name = name;
	}
	
	//to retrieve name
	String getName()
	{
		return name;
	}
	
	//to store address
	void setAddress(String address)
	{
		this.address = address;
	}
	
	//to retrieve address
	String getAddress()
	{
		return address;
	}
	
	//to store salary
	void setSal(float sal)
	{
		this.sal = sal;
	}
	
	//to retrieve salary
	float getSal()
	{
		return sal;
	}
}