//class C of another package

package another;

import same.A;

public class C extends A
{
	public static void main(String args[])
	{
		//access the members of class A
		A obj = new A();
		System.out.println(obj.a);	//cannot access this as this is private
		System.out.println(obj.b);	//can access this as this is public
		System.out.println(obj.c);	//cannot access this without inheritance
		System.out.println(obj.d);	//cannot access this as this is default
	}
}