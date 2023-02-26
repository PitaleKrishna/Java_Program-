package IMP_JAVA_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Min_Value_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer min = Stream.of(1,2,3,4,5,6)
				   .min(Comparator.comparing(Integer::valueOf))
				   .get();
		System.out.println(min);
		 

	}

}
