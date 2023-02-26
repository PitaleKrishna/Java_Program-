package in.AllConceptProgram;
import java.util.Scanner;

public class BiggestNumber {

	
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
        System.out.println("Frist Number :");
        a=sc.nextInt();
        System.out.println("secound Number :");
        b=sc.nextInt();
        System.out.println("thried Number :");
        c=sc.nextInt();
        
        if(a>b && a>c)
        {
        	System.out.println("Largest Number is :"+a);
        }else if(b>c) {
        	System.out.println("Largest Number is :"+b);
        }else 
        {
        	System.out.println("Largest Number is :"+c);
        }
	}
}
