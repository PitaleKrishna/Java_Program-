package IMP_JAVA_8;

public class AddtionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Multiple parameters in lambda expression
		Addition ad=(a,b)->(a+b);
		System.out.println(ad.add(40, 30));
		
		// Multiple parameters in lambda expression
		
		Addition a=(int k,int p)->(k+p);
		System.err.println(a.add(500, 400));
		
		// Lambda expression with return keyword.
		Addition a1=(int j,int i)->{
			return j+i;
		};
		System.out.println(a1.add(500, 200));
		
		 
		

	}

}
