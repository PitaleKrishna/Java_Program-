package Logical;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		 
		
		int []arr= {0,5,6,4,2,1,7,8,6,9};
		
		for(int s:arr)
		{
			System.err.print(s+" ");
		}
		Arrays.parallelSort(arr,4,9);
		
		System.out.println("\nAfter Sorting Array =");
		
		for(int i:arr)
		{
			System.err.print(i+" ");
		}

	}

}
