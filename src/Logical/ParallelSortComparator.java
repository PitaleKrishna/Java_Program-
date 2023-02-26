package Logical;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelSortComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {0,7,9,5,4,3,6,8,2,1};
		
		System.out.println("Array Elements Before Sorting....");
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		//MyComparatorClass mcc=new MyComparatorClass();
		Arrays.parallelSort(arr);
		
		System.err.println("\nArray elements after Sorting.....");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}

	}

//}

// class MyComparatorClass  implements Comparator<object>{
	
//	public int compare(object obj1,object obj2)
//	{
//		Integer x=(Integer)obj1;
//		Integer y=(Integer)obj2;
//		
//		if(x.compareTo(y)>0)
//		{
//			return +1;
//		}
//	else {
//				return -1;
//			}
		
	}
//}
