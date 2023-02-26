package in.AllConceptProgram;

public class FibonciesSerie {

	public static void main(String[] args) {
		
		
		int a=0, b=1, c,num=12;
		
		System.err.println(a);
		System.out.println(b);
		
		for(int i=2; i<=num; i++)
		{
		c=a+b;
		System.err.println(c);
		a=b;
		b=c;
		}
	}
}
