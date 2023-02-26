package Logical;

import java.util.Scanner;

public class StringToArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your String :");
		String string=s.nextLine();
		char ch[]=string.toCharArray();
		
		for(char c:ch)
		{
			System.out.println(c);
		}
	}
}
