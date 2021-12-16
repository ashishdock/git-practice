//calss B of same package

package same;

class B
{
	public static void main(String args[])
	{
		//access the members of class A
		A obj = new A();
		//System.out.println(obj.a); unaccessible variable a for this class
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}