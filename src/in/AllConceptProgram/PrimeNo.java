package in.AllConceptProgram;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//	 int n,count=0;
//	 Scanner s=new Scanner(System.in);
//	 System.err.println("Enter your Number :");
//	 n=s.nextInt();
//	 
//	 for(int i=1 ; i<=n; i++)
//	 {
//		 if(n%i==0)
//		 {
//			count++; 
//		 }
//	 }
//	 if(count==2)
//		 System.out.println("Numer is prime");
//	 else
//		 System.out.println("Number is Not prime");
	 
		
		
		int n=100,count;
		
		for(int i=2; i<=n; i++)
		{
			count=0;
			for(int j=1 ; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.err.println("1 to 100 prime No  :" +i);
		}
		
	}
}
