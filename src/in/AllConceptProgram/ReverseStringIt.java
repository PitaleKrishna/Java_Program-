package in.AllConceptProgram;

public class ReverseStringIt {

	public static void main(String[] args) {
		String str="myjava";
		char[] strArray=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();

	}
}
