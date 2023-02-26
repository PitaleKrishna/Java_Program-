package Logical;

public class UsingRecursion {
	
	String str="myjava";
	static String recursiveMethod(String str) {
		if((null==str) ||(str.length()<=1)) {
			return str;
		}
		return recursiveMethod((str.substring(1))+str.charAt(0));
	}

	public static void main(String[] args) {
	     
	}

}
