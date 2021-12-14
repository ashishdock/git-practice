//Area of a circle
import java.text.*;
class FactoryMethodTest1 {
	public static void main(String args[]){
		final double PI = (double)22/7;
		double r = 15.5;
		double area = PI*r*r;
		System.out.println("Area of circle: " + area);
		
		//create NumberFormat class object
		NumberFormat obj = NumberFormat.getNumberInstance();
		//store the format information into obj
		obj.setMaximumFractionDigits(2);
		obj.setMinimumIntegerDigits(2);
		obj.setMaximumIntegerDigits(9);
		
		//apply the format to area value
		String str = obj.format(area);
		
		//display formatted area value
		System.out.println("Area of circle: " + str);
	}
}