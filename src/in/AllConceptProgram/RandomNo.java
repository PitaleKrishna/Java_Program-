package in.AllConceptProgram;

public class RandomNo {

	public static void main(String[] args) {
		
		int min=100;
		int max=500;
		
		double a=Math.random()*(max-min+1)+min;
		System.err.println(a);
		
		int b=(int)(Math.random()*(max-min+1)+min);
		System.err.println(b);
		
	}
}
