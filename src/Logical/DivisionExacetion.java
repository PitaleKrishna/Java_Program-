package Logical;

public class DivisionExacetion {

	
	
	public static void main(String[] args) 
	{
		try{
		      int a=Integer.parseInt(args[10]);
		      int b=Integer.parseInt(args[2]);
		
		       int c=a/b;

		      System.out.println(c);
    	}
	     catch(ArrayIndexOutOfBoundsException aiob){
		             System.out.println("please pass atleast two integer values");
       }
        catch(NumberFormatException nfe){
                    System.out.println("please pass only integer values");
       }
        catch(ArithmeticException ae){
                     System.out.println("please DONOT pass second value as ZERO");
	    }
	}
}
