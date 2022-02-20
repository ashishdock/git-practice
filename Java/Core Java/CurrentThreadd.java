//To find currently running thread in this program
class CurrentThreadd
{
	public static void main(String args[])
	{
		System.out.println("Let us find current thread");
		Thread t = Thread.currentThread();
		System.out.println("Current thread =" + t);
		System.out.println("Its name = " + t.getName());
	}
}