package IMP_Program_2_Year;

import java.util.Scanner;

public class Reverse_String_Using_Recursion {
	
	static void reverse(String str)
	{
		if(str==null || (str.length()<=1))
		{
			System.out.println(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
			
		}
	}
     public static void main(String[] args) {
		
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter Your String =");
    	 String str=s.nextLine();
    	 System.out.println("Reverse String =");
    	 reverse(str);
	}
}
