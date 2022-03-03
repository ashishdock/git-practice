import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}

class Meta1
{
	//myMeth now has two arguments
	@MyAnno(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i)
	{
		Meta1 ob = new Meta1();
		
		try
		{
			Class<?> c = ob.getClass();
			
			//Here, the parameter types are specified.
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		}
		catch(NoSuchMethodException e)
		{
			System.out.println("Method not found.");
		}
	}
	
	public static void main(String args[])
	{
		myMeth("Test", 10);
	}
}