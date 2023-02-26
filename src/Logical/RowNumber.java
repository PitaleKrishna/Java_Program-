package Logical;

public class RowNumber {

	
	public static void main(String[] args) {
	
      for(int i=1; i<=5; i++)
      {
    	  for(int j=i; j<=5; j++)
    	  {
    		  System.err.print(" ");
    	  }
    	  for(int j=1; j<=(i*2)-1; j++)
    	  {
    		  System.err.print("*");
    	  }
    	  System.out.println();
      }
      
      for(int i=5; i<=1; i++)
      {
    	  for(int j=5; j<=i; j++)
    	  {
    		  System.err.print("*");
    	  }
    	 
    	  System.out.println();
      }
		
	}
}
