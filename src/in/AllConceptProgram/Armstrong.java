package in.AllConceptProgram;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n,r,sum=0,temp,i;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Your Number :");
		 n=s.nextInt();
		 
		 temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armtrong Number");
		
	}

}
