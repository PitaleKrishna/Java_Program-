package Logical;

import java.util.Scanner;

public class SwapWithOutThredVariable {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.err.println("Enter your First Number a= :");
		a=s.nextInt();
		System.out.println("Enter Your Secound Number b= :");
		b=s.nextInt();
		
		b=b+a;
		a=b-a;
		b=b-a;
		System.err.println("a= "+a);
		System.out.println("b= "+b);
		
	}
}
