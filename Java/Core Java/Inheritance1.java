//Using Student class
class Inheritance1 {
	public static void main(String args[]) 
	{
		//create an object to Student class
		Student s = new Student();
		
		//store data into object - for this use setter methods
		s.setId(1001);
		s.setName("Chandra Sekhar");
		s.setAddress("MID-12, Kukatpally, Hyderabad");
		s.setMarks(950);
		
		//retrieve data using getter methods and display
		System.out.println("Id:\t\t" + s.getId());
		System.out.println("Name:\t\t" + s.getName());
		System.out.println("Address:\t" + s.getAddress());
		System.out.println("Marks:\t\t" + s.getMarks());
	}
}