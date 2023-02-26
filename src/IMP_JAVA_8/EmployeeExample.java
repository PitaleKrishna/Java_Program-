package IMP_JAVA_8;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lambda expression with single parameter.
		Employee e=(name)->{
			
			return "Name," +name;
		};
		String s=e.name("Krishna");
		System.out.println(s);
		
		// You can omit function parentheses
		Employee s1=name->{
			return "Hello,"+name;
		};
		System.err.println(s1.name("Anu"));
		
	}

}
