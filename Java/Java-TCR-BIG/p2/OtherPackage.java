package p2;

class OtherPackage
{
	OtherPackage()
	{
		p1.Protection p = new p1.Protection();
		System.out.println("other package constructor")
		
		//class or package only
		//System.out.println("n = " + p.n);
		
		//class only
		//System.out.println("n_pri = " + n_pri);
		
		//class subclass or package only
		//System.out.println("n_pro = " + n_pro);
		
		System.out.println("n_pub = " + n_pub);
	}
}