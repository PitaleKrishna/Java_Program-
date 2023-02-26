package IMP_JAVA_8;

import java.util.Arrays;
import java.util.List;

public class Iterate_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str = Arrays.asList("Hello","Interview","Questions","Answers");
        str.stream().forEach(System.out::println);

	}

}
