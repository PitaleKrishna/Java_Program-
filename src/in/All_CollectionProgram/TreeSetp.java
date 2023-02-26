package in.All_CollectionProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tr=new TreeSet<>();
		
		tr.add("Krishna");
		tr.add("Anu");
		tr.add("Sadhana");
		tr.add("Rahul");
		tr.add("Mithun");
		tr.add("Priya");
		
		System.out.println(tr);
		
	Iterator<String> itr=tr.iterator();
	System.err.println(itr);
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
  }
  for (String string : tr) {
	  System.err.println(string);
	
}

	}

}
