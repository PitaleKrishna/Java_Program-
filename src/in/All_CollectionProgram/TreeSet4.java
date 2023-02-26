package in.All_CollectionProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		
		TreeSet <String> ts=new TreeSet<>();
		
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("");
		ts.add("E");
		ts.add("F"); 
		ts.add("B");
		
		
		System.err.println("Initial Set +"+ts);
		
		System.out.println("Reverse Set ="+ts.descendingSet());
		
		System.err.println("Head Set ="+ts.headSet("E", true));
		
		System.out.println("Sub Set " +  ts.subSet("A", true, "D", false));
		
		System.err.println("Tail Set +"+ ts.tailSet("C", false));
		 
		}
	}

