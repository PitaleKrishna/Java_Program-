package IMP_Program_2_Year;

public class Number_of_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Krishna Pitale";
		System.out.println(str);
		int count=0;
		char ch[]=str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
			System.out.println(str.charAt(i)+"="+count);
		}
		System.out.println("Total Charecters in String ="+count);

	}

}
