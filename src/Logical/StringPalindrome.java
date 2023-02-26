package Logical;

import java.util.Scanner;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=s.nextLine();
		String rev="";
		for(int i=name.length()-1; i>=0; i--)
		{
			rev= rev+name.charAt(i);
			
		}
		if(name.equals(rev))
		{
			System.err.println(" String is polindrome");
			
		}else
			System.err.println("not Polimdrome");
		
	}

}
