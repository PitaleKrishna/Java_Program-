package in.AllConceptProgram;
import java.util.Scanner;

public class NumberPyramid1 {

	

	public static void main(String[] args) {
	 
	
		Scanner s=new Scanner(System.in);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows you want:");
		int noOfRows=sc.nextInt();
		int rowCount=1;
		System.out.println("here is pyramid:");
		
		for(int i=noOfRows;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=rowCount;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
			rowCount++;
		
	}
		}}
