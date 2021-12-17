// a queue with Integer objects

import java.util.*;

class QueueDemo
{
	public static void main(String args[])
	{
		//create a linked list as a queue
		Queue<Integer> q = new LinkedList<>();

		//store integers from 1 to 5
		//these integers are converted into Integer objects and then stored into q
		for (int i=1; i<6; i++)
		{
			q.offer(i);
		}
		
		//retrieve integers from queue
		System.out.println("The queue is: ");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}

	}
}