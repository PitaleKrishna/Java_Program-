package Logical;

public class Matrix_1 {

	public static void main(String[] args) {
		 
		 
        int a[][] = {  
                        {4, 5, 6},  
                        {3, 4, 1},  
                        {1, 2, 3}  
                     };  

        
        int b[][] = {  
                        {2, 0, 3},  
                       {2, 3, 1},  
                       {1, 1, 1}  
                   };
        
        int row,col ;
         row=a.length;
         col=a[0].length;
        
        int add[][]=new int [row][col];

	
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col; j++)
		{
			add[i][j]=a[i][j]+a[i][j];
			 
		}
	}
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col; j++)
		{
	     System.out.print(add[i][j]+" ");
		}
		System.out.println();
		}
	}
	
}
