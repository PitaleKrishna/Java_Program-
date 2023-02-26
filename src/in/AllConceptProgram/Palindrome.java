package in.AllConceptProgram;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,temp,sum=0,r;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number :");
		n=s.nextInt();
		temp=n;
		while (n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.err.println("Palindrome Number");
		else
			System.err.println("Not Palindrome");
	}

}
