package IMP_Program_2_Year;

public class Duplicate_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Maximum and Minimum";
		int count;
		System.out.println("The entered string is:" + str1);
		
		char str[]=str1.toCharArray();
		
		System.out.println("Duplicate characters in a given string: ");
		
		for(int i=0; i<str.length; i++)
		{
			count=1;
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]==str[j] && str[i]!=' ')
				{
					count++;
					str[j]='0';
				}
			}
			
			if(count> 1 && str[i] != '0')
			{
				System.out.println(str[i]+"="+count);
			}
		}

	}

}
