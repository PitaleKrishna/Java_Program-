package in.All_CollectionProgram;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
	   TreeSet <Integer> ts=new TreeSet<>();
	   
	   ts.add(95);
	   ts.add(55);
	   ts.add(85);
	   ts.add(44);
	   ts.add(34);
	   ts.add(12);
	   
	   System.out.println("Lowest Value ="+ts.pollLast());
	   System.err.println("Highest Value ="+ts.pollFirst());
	}
}
