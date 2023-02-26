package in.AllConceptProgram;
import java.util.Scanner;

public class CountVowel {
	
	
	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Name :");
	    String name=s.nextLine();
	    char [] ch=name.toCharArray();
	    
	    int count=0;
	    
	    for(char c:ch)
	    {
	    	switch(c)
	    	{
	    		case 'a':;
	    		case 'e':;
	    		case 'i':;
	    		case 'u':;
	    		case 'o':;
	    		System.err.println("The vovel in name :"+c);
	    		count++;
	    		
	    		break;
	    		
	    	}
	    	
	    }
	    
	}
	

}
