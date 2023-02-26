package in.AllConceptProgram;
import java.util.Scanner;

public class Reverse_Number {
  
	
	public static void main(String[] args) {
		
		int r,n,sum=0;
		Scanner s=new Scanner(System.in);
		System.err.println("Enter your Number:");
		n=s.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.err.println("Reverce Number :" +sum);
	}
}
