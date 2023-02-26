package in.All_CollectionProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet <String> ts=new TreeSet<>();
		
		ts.add("Pratik");
		ts.add("Rahul");
		ts.add("Priya");
		ts.add("Krishna");
		ts.add("Anu");
		ts.add("Rahul");
		
		System.err.println("Traversing element through Iterator in descending order");
		
		Iterator<String> itr=ts.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
