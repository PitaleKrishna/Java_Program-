package in.All_CollectionProgram;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PrioritQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue <String> pq=new PriorityQueue<>();
		
		pq.add("Krishna");
		pq.add("Anu");
		pq.add("Sadhna");
		pq.add("Anu");
		pq.add("Rahul");
		
		System.out.println(pq);
		System.err.println("Head ="+pq.element());
		System.out.println("Head ="+pq.peek());
		System.out.println(".......iterating the queue elements........");
		
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext())
		{
			System.err.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("......after removing two elements:......");
		Iterator<String> itr2=pq.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
