import java.lang.annotation.*;
import java.lang.reflect.*;

//create a single value annotation which can be applied to a method.
//Make it available to the JVM at runtime

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
	int value();  //this variable name must be value only
}
// we will apply MySingle annotation to a method in the following class

class MyCustomAnnoClass
{
	//annotate a method using MySingle annotation. Store value 100 into MySingle annotation
	@MySingle(value=100)
	public void myMethod()
	{
		System.out.println("Hello");
	}
}

//access the MySingle annotation value using another program
public class DemoAnno
{
	public static void main(String args[]) throws Exception
	{
		//create MyClass object
		MyCustomAnnoClass obj = new MyCustomAnnoClass();
		
		//getClass() method returns Class object and getMethod() returns the Method object
		Method m = obj.getClass().getMethod("myMethod");
		
		//now retrieve the single annotation associated with the method
		MySingle anno = m.getAnnotation(MySingle.class);
		
		//retrieve and display the value in the annotation
		System.out.println("Value = " + anno.value());
	}
}
