//Multiple inheritance using interfaces
interface Father 
{
	float HT = 6.2f;
	void height();
}

interface Mother
{
	float HT = 5.8f;
	void height();
}

class Child implements Father, Mother 
{
	public void height()
	{
		//child got average height of its parents
		float ht = (Father.HT + Mother.HT)/2;
		System.out.println("Child's height = " + ht);
	}
}

class MultiInterface
{
	public static void main(String args[])
	{
		Child ch = new Child();
		ch.height();
	}
}