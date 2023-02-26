package IMP_JAVA_8;

public class Thread_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread Example without lambda 
		Runnable r=new Runnable() {
			
		    public void run() {
		    	
		    	System.err.println("Thread 1 is Run");
		    }
		};
		Thread t=new Thread(r);
		t.start();
		
		//Thread Example with lambda
		Runnable r1=()->{
			System.out.println("Thread 2 is Run");
		};
         Thread t2=new Thread(r1);
         t2.start();
	}

}
