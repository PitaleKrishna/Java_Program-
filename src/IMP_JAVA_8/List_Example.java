package IMP_JAVA_8;

import java.util.ArrayList;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> li= new ArrayList<>();
		li.add("Krishna");
		li.add("Anu");
		li.add("Sadhna");
		li.add("Push");
		
		li.forEach(
				(n)-> System.out.println(n)
				);
		

	}

}
