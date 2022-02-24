// A program to create multi-value annotation that stores only 3 values: one integer number and two strings. The annotation can be retrieved by JVM during runtime
//Create a multi-value annotation and apply it to a class. Make it available to the JVM at runtime

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti
{
	int value1();
	String value2();
	String value3();
}

//anootate a class using MyMulti annotation. Store values too
@MyMulti(value1 = 10, value2 = "Srinu", value3 = "Ameerpet, Hyderabad")
class MyMultiAnnoClass
{
	void myMethod()
	{
		System.out.println("Hello");
	}
}

//access the MyMulti annotation values using another program

class DemoMultiAnno
{
	public static void main(String args[]) throws Exception
	{
		//store the class name in an object 
		Class obj = Class.forName("MyMultiAnnoClass");
		//now retrieve all annotations associated with the class into Annotation[] array
		Annotation[] annot = obj.getAnnotations();
		
		//use a for each loop to repeat with each annotation
		for(Annotation x : annot)
		{
			//if the specific annotation (x) belongs to MyMulti then store it into MyMulti object
			if(x instanceof MyMulti)
			{
				MyMulti a = (MyMulti)x;
				//retrieve the values associated with that MyMulti object
				System.out.println("Value1 = " + a.value1());
				System.out.println("Value2 = " + a.value2());
				System.out.println("Value3 = " + a.value3());
			}
		}
	}
}
