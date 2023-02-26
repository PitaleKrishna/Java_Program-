package in.AllConceptProgram;


public class Example {

	public static void main(String[] args) {

		String name = "Java is good progmming language";

		String[] a = name.split(" ");

		int b[][] = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			System.err.println(a[i]);
		}
		int h = 0, sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = h; k < a.length; k++) {
					b[i][j] = a[k].length();
					System.out.println(b[i][j]);
					h++;
					k = a.length;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + b[i][j];
			}
		}
		System.out.println(sum);
	}

}
